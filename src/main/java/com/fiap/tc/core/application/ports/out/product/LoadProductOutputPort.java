package com.fiap.tc.core.application.ports.out.product;

import com.fiap.tc.domain.entities.Product;

import java.util.UUID;

public interface LoadProductOutputPort {
    Product load(UUID idProduct);
}

