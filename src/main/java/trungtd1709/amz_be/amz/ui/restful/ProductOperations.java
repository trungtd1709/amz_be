package trungtd1709.amz_be.amz.ui.restful;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import trungtd1709.amz_be.amz.core.factory.response.GeneralResponse;

import java.io.UnsupportedEncodingException;

@RequestMapping("/api/v1/private/products")
public interface ProductOperations {
//    @PostMapping
//    ResponseEntity<GeneralResponse<String>> create(@RequestBody @Valid ProductDTO dto) throws UnsupportedEncodingException, JsonProcessingException

    @GetMapping
    ResponseEntity<GeneralResponse<String>> getProduct() throws UnsupportedEncodingException, JsonProcessingException;
}
