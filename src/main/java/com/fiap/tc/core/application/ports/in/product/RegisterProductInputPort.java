package com.fiap.tc.core.application.ports.in.product;

import com.fiap.tc.domain.entities.Product;

public interface RegisterProductInputPort {
    Product register(Product product);
}
