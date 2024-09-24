package com.fiap.tc.core.application.ports.out.product;

import com.fiap.tc.domain.entities.Product;

public interface RegisterProductOutputPort {
    Product saveOrUpdate(Product product);
}
