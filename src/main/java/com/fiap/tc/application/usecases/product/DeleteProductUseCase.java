package com.fiap.tc.application.usecases.product;

import com.fiap.tc.application.gateways.IProductGateway;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DeleteProductUseCase {

    private final IProductGateway productGateway;

    public DeleteProductUseCase(IProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    public void delete(UUID idProduct) {
        productGateway.delete(idProduct);
    }
}
