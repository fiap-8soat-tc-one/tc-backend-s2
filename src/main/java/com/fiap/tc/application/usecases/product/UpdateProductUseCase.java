package com.fiap.tc.application.usecases.product;

import com.fiap.tc.core.application.ports.in.product.UpdateProductInputPort;
import com.fiap.tc.core.application.ports.out.product.UpdateProductOutputPort;
import com.fiap.tc.domain.entities.Product;
import org.springframework.stereotype.Service;

@Service
public class UpdateProductUseCase implements UpdateProductInputPort {
    private final UpdateProductOutputPort updateProductNameOutputPort;

    public UpdateProductUseCase(UpdateProductOutputPort updateProductNameOutputPort) {
        this.updateProductNameOutputPort = updateProductNameOutputPort;
    }

    @Override
    public Product update(Product product) {
        return updateProductNameOutputPort.update(product);
    }
}