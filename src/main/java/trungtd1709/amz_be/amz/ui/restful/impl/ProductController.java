package trungtd1709.amz_be.amz.ui.restful.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import trungtd1709.amz_be.amz.core.factory.response.GeneralResponse;
import trungtd1709.amz_be.amz.core.factory.response.ResponseFactory;
import trungtd1709.amz_be.amz.ui.restful.ProductOperations;

@RestController
public class ProductController implements ProductOperations {
    private final ResponseFactory responseFactory;

    public ProductController(ResponseFactory responseFactory) {
        this.responseFactory = responseFactory;
    }

    @Override
    public ResponseEntity<GeneralResponse<String>> getProduct(){
        return responseFactory.success("test");
    }
}
