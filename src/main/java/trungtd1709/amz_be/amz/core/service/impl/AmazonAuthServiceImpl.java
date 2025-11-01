package trungtd1709.amz_be.amz.core.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import trungtd1709.amz_be.amz.core.domain.dto.response.AmazonTokenResponse;
import trungtd1709.amz_be.amz.core.port.client.ClientTemplate;
import trungtd1709.amz_be.amz.core.service.AmazonAuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;
import trungtd1709.amz_be.amz.core.port.client.ClientTemplate;

@Service
@Slf4j
@RequiredArgsConstructor
public class AmazonAuthServiceImpl implements AmazonAuthService {
    private final ClientTemplate clientTemplate;

    @Value("${amazon.auth.url}")
    private String amazonAuthUrl;

    @Value("${amazon.client.id}")
    private String clientId;

    @Value("${amazon.client.secret}")
    private String clientSecret;

    @Value("${amazon.client.refresh.token}")
    private String refreshToken;

    @Override
    public String getAccessToken() {
        log.info("Getting access token from Amazon with refresh token");

        // Prepare headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        // Prepare request body as form data
        String requestBody = buildFormUrlEncodedBody();

        // Call Amazon API
        ResponseEntity<AmazonTokenResponse> response = clientTemplate.post(
                amazonAuthUrl,
                headers,
                requestBody,
                AmazonTokenResponse.class
        );

        if (response.getBody() == null) {
            throw new RuntimeException("Failed to get access token from Amazon");
        }

        log.info("Successfully retrieved access token from Amazon");
        return response.getBody().getAccessToken();
    }

    /**
     * Build form-urlencoded request body
     */
    private String buildFormUrlEncodedBody() {
        return UriComponentsBuilder.newInstance()
                .queryParam("grant_type", "refresh_token")
                .queryParam("refresh_token", refreshToken)
                .queryParam("client_id", clientId)
                .queryParam("client_secret", clientSecret)
                .build()
                .encode()
                .toUriString()
                .substring(1); // Remove leading '?'
    }
}
