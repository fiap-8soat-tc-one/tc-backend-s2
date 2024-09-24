package com.fiap.tc.core.application.ports.out.product;

import com.fiap.tc.domain.entities.Product;
import com.fiap.tc.domain.entities.ProductImage;

import java.util.List;
import java.util.UUID;

public interface RegisterProductImagesOutputPort {
    Product save(UUID idProduct, List<ProductImage> images);
}
