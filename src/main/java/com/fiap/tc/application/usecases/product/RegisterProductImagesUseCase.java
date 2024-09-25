package com.fiap.tc.application.usecases.product;

import com.fiap.tc.application.gateways.IProductImagesGateway;
import com.fiap.tc.domain.entities.Product;
import com.fiap.tc.domain.entities.ProductImage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RegisterProductImagesUseCase {
    private final IProductImagesGateway productImagesGateway;

    public RegisterProductImagesUseCase(IProductImagesGateway productImagesGateway) {
        this.productImagesGateway = productImagesGateway;
    }

    public Product register(UUID idProduct, List<ProductImage> images) {

        return productImagesGateway.register(idProduct, images);
    }
}
