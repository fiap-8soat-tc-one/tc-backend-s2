package com.fiap.tc.application.usecases.category;

import com.fiap.tc.application.gateways.CategoryGateway;
import com.fiap.tc.domain.entities.Category;
import org.springframework.stereotype.Service;

@Service
public class RegisterCategoryUseCase {

    private final CategoryGateway categoryGateway;

    public RegisterCategoryUseCase(CategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    public Category register(String name, String description) {
        return categoryGateway.register(name, description);
    }
}


