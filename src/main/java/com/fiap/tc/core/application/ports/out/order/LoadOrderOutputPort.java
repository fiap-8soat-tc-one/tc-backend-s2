package com.fiap.tc.core.application.ports.out.order;

import com.fiap.tc.domain.entities.Order;

import java.util.UUID;

public interface LoadOrderOutputPort {
    Order load(UUID uuid);
}

