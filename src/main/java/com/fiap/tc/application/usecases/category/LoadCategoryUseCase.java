package com.fiap.tc.application.usecases.category;

import com.fiap.tc.application.gateways.ICategoryGateway;
import com.fiap.tc.domain.entities.Category;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LoadCategoryUseCase {

    private final ICategoryGateway categoryGateway;

    public LoadCategoryUseCase(ICategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    public Category load(UUID id) {
        return categoryGateway.load(id);
    }
}


