package trungtd1709.amz_be.amz.ui.restful.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import trungtd1709.amz_be.amz.core.factory.response.GeneralResponse;
import trungtd1709.amz_be.amz.core.factory.response.ResponseFactory;
import trungtd1709.amz_be.amz.ui.restful.ProductOperations;

import java.io.UnsupportedEncodingException;

@RestController
public class ProductController implements ProductOperations {
    @Override
    public ResponseEntity<GeneralResponse<String>> getProduct() throws UnsupportedEncodingException, JsonProcessingException {
        return ResponseEntity.ok(ResponseFactory.success("test"));
    }
}
