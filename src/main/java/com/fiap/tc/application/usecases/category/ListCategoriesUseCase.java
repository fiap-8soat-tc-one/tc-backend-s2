package com.fiap.tc.application.usecases.category;

import com.fiap.tc.application.gateways.CategoryGateway;
import com.fiap.tc.domain.entities.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ListCategoriesUseCase {

    private final CategoryGateway categoryGateway;

    public ListCategoriesUseCase(CategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    public Page<Category> list(Pageable pageable) {
        return categoryGateway.list(pageable);
    }
}


