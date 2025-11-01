package trungtd1709.amz_be.amz.core.port.client;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

/**
 * POST, GET sang hệ thống khác
 *
 */
public interface ClientTemplate {

    /**
     * get blocking
     * @param uri             uri
     * @param headers         http headers
     * @param responseClass   class của response, ví dụ: TopUpResponse.Class
     * @return                responseDTO
     */
    <R> ResponseEntity<R> get(String uri, HttpHeaders headers, Class<R> responseClass);
    <R> ResponseEntity<R> get(String uri, HttpHeaders headers, ParameterizedTypeReference<R> responseClass);
    <R> ResponseEntity<R> get(String uri, HttpHeaders headers, Class<R> responseClass, Object... uriVariables);

    /**
     * post blocking
     * @param uri            uri
     * @param headers        http headers
     * @param body           class của body request, ví dụ: TopUpDTO.Class
     * @param responseClass  class của response, ví dụ: TopUpResponse.Class
     * @return               responseDTO
     */
    <R> ResponseEntity<R> post(String uri, HttpHeaders headers, Object body, Class<R> responseClass);
    <R> ResponseEntity<R> post(String uri, HttpHeaders headers, Object body, ParameterizedTypeReference<R> responseClass);
}
