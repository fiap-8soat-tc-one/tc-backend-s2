package com.fiap.tc.core.application.ports.in.order;

import com.fiap.tc.domain.enums.OrderStatus;

import java.util.UUID;

public interface UpdateStatusOrderInputPort {
    void update(UUID id, OrderStatus status);
}
