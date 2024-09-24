package com.fiap.tc.application.usecases.product;

import com.fiap.tc.core.application.ports.in.product.RegisterProductImagesInputPort;
import com.fiap.tc.core.application.ports.out.product.RegisterProductImagesOutputPort;
import com.fiap.tc.domain.entities.Product;
import com.fiap.tc.domain.entities.ProductImage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RegisterProductImagesUseCase implements RegisterProductImagesInputPort {
    private final RegisterProductImagesOutputPort registerProductImagesOutputPort;

    public RegisterProductImagesUseCase(RegisterProductImagesOutputPort registerProductImagesOutputPort) {
        this.registerProductImagesOutputPort = registerProductImagesOutputPort;
    }

    @Override
    public Product register(UUID idProduct, List<ProductImage> images) {

        return registerProductImagesOutputPort.save(idProduct, images);
    }
}
