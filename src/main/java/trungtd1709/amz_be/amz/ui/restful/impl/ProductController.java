package trungtd1709.amz_be.amz.ui.restful.impl;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import trungtd1709.amz_be.amz.core.factory.response.GeneralResponse;
import trungtd1709.amz_be.amz.core.factory.response.ResponseFactory;
import trungtd1709.amz_be.amz.core.service.AmazonAuthService;
import trungtd1709.amz_be.amz.ui.restful.ProductOperations;

@RestController
@AllArgsConstructor
public class ProductController implements ProductOperations {
    private final ResponseFactory responseFactory;
    private final AmazonAuthService authService;

    @Override
    public ResponseEntity<GeneralResponse<String>> getProduct(){
        return responseFactory.success(authService.getAccessToken());
    }
}
