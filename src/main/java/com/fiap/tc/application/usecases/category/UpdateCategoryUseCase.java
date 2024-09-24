package com.fiap.tc.application.usecases.category;

import com.fiap.tc.application.gateways.CategoryGateway;
import com.fiap.tc.domain.entities.Category;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UpdateCategoryUseCase {

    private final CategoryGateway categoryGateway;

    public UpdateCategoryUseCase(CategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    public Category update(UUID id, String name, String description) {
        return categoryGateway.update(id, name, description);
    }
}