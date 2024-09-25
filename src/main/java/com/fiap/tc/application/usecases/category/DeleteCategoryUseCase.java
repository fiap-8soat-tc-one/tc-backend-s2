package com.fiap.tc.application.usecases.category;

import com.fiap.tc.application.gateways.ICategoryGateway;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DeleteCategoryUseCase {

    private final ICategoryGateway categoryGateway;

    public DeleteCategoryUseCase(ICategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    public void delete(UUID id) {
        this.categoryGateway.delete(id);
    }
}


