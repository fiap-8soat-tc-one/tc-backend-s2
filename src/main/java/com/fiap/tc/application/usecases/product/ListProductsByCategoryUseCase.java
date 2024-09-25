package com.fiap.tc.application.usecases.product;

import com.fiap.tc.application.gateways.IProductGateway;
import com.fiap.tc.domain.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ListProductsByCategoryUseCase {

    private final IProductGateway productGateway;

    public ListProductsByCategoryUseCase(IProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    public Page<Product> list(UUID idCategory, Pageable pageable) {
        return productGateway.list(idCategory, pageable);
    }
}
