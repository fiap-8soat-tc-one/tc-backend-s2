package com.fiap.tc.core.application.ports.in.category;

import com.fiap.tc.domain.entities.Category;

import java.util.UUID;

public interface LoadCategoryInputPort {
    Category load(UUID uuid);
}
