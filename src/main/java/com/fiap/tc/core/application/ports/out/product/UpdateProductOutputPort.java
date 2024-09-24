package com.fiap.tc.core.application.ports.out.product;

import com.fiap.tc.domain.entities.Product;

public interface UpdateProductOutputPort {
    Product update(Product product);
}
