package trungtd1709.amz_be.amz.infrastructure.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import trungtd1709.amz_be.amz.core.port.client.ClientTemplate;

@Component
@Slf4j
public class ClientAdapter implements ClientTemplate {
    private static final String REQUEST = "REST REQUEST: URL[{}], HTTP-METHOD[{}], HTTP-ENTITY[{}]";
    private static final String RESPONSE = "REST RESPONSE: STATUS[{}], BODY[{}]";
    private static final String ERROR = "REST ERROR: URL[{}], HTTP-METHOD[{}], ERROR[{}]";

    private final RestTemplate restTemplate;

    public ClientAdapter(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public <R> ResponseEntity<R> get(String uri, HttpHeaders headers, Class<R> responseClass) {
        HttpEntity<?> httpEntity = new HttpEntity<>(headers);
        log.info(REQUEST, uri, HttpMethod.GET, httpEntity);

        try {
            ResponseEntity<R> response = restTemplate.exchange(
                    uri,
                    HttpMethod.GET,
                    httpEntity,
                    responseClass
            );

            log.info(RESPONSE, response.getStatusCode(), response.getBody());
            return response;
        } catch (RestClientException e) {
            log.error(ERROR, uri, HttpMethod.GET, e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public <R> ResponseEntity<R> get(String uri, HttpHeaders headers, ParameterizedTypeReference<R> responseClass) {
        HttpEntity<?> httpEntity = new HttpEntity<>(headers);
        log.info(REQUEST, uri, HttpMethod.GET, httpEntity);

        try {
            ResponseEntity<R> response = restTemplate.exchange(
                    uri,
                    HttpMethod.GET,
                    httpEntity,
                    responseClass
            );

            log.info(RESPONSE, response.getStatusCode(), response.getBody());
            return response;
        } catch (RestClientException e) {
            log.error(ERROR, uri, HttpMethod.GET, e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public <R> ResponseEntity<R> get(String uri, HttpHeaders headers, Class<R> responseClass, Object... uriVariables) {
        HttpEntity<?> httpEntity = new HttpEntity<>(headers);
        log.info(REQUEST, uri, HttpMethod.GET, httpEntity);

        try {
            ResponseEntity<R> response = restTemplate.exchange(
                    uri,
                    HttpMethod.GET,
                    httpEntity,
                    responseClass,
                    uriVariables
            );

            log.info(RESPONSE, response.getStatusCode(), response.getBody());
            return response;
        } catch (RestClientException e) {
            log.error(ERROR, uri, HttpMethod.GET, e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public <R> ResponseEntity<R> post(String uri, HttpHeaders headers, Object body, Class<R> responseClass) {
        HttpEntity<?> httpEntity = new HttpEntity<>(body, headers);
        log.info(REQUEST, uri, HttpMethod.POST, httpEntity);

        try {
            ResponseEntity<R> response = restTemplate.exchange(
                    uri,
                    HttpMethod.POST,
                    httpEntity,
                    responseClass
            );

            log.info(RESPONSE, response.getStatusCode(), response.getBody());
            return response;
        } catch (RestClientException e) {
            log.error(ERROR, uri, HttpMethod.POST, e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public <R> ResponseEntity<R> post(String uri, HttpHeaders headers, Object body, ParameterizedTypeReference<R> responseClass) {
        HttpEntity<?> httpEntity = new HttpEntity<>(body, headers);
        log.info(REQUEST, uri, HttpMethod.POST, httpEntity);

        try {
            ResponseEntity<R> response = restTemplate.exchange(
                    uri,
                    HttpMethod.POST,
                    httpEntity,
                    responseClass
            );

            log.info(RESPONSE, response.getStatusCode(), response.getBody());
            return response;
        } catch (RestClientException e) {
            log.error(ERROR, uri, HttpMethod.POST, e.getMessage(), e);
            throw e;
        }
    }
}