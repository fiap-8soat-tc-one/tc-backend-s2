package com.fiap.tc.core.application.ports.out.order;

import com.fiap.tc.domain.enums.OrderStatus;

import java.util.UUID;

public interface UpdateStatusOrderOutputPort {
    void update(UUID idOrder, OrderStatus status);
}
