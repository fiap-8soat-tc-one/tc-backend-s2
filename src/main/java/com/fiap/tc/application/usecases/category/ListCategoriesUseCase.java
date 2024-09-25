package com.fiap.tc.application.usecases.category;

import com.fiap.tc.application.gateways.ICategoryGateway;
import com.fiap.tc.domain.entities.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ListCategoriesUseCase {

    private final ICategoryGateway categoryGateway;

    public ListCategoriesUseCase(ICategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    public Page<Category> list(Pageable pageable) {
        return categoryGateway.list(pageable);
    }
}


