package com.fiap.tc.application.usecases.product;

import com.fiap.tc.application.gateways.IProductGateway;
import com.fiap.tc.domain.entities.Product;
import org.springframework.stereotype.Service;

@Service
public class RegisterProductUseCase {

    private final IProductGateway productGateway;

    public RegisterProductUseCase(IProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    public Product register(Product product) {
        return productGateway.register(product);
    }
}
