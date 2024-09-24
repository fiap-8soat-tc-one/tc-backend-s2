package com.fiap.tc.core.application.ports.in.category;

import com.fiap.tc.domain.entities.Category;

public interface RegisterCategoryInputPort {
    Category register(String name, String description);
}
