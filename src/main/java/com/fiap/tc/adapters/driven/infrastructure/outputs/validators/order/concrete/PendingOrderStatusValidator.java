package com.fiap.tc.adapters.driven.infrastructure.outputs.validators.order.concrete;

import com.fiap.tc.core.domain.fixed.OrderStatus;

import java.util.List;


public class PendingOrderStatusValidator extends OrderStatusValidatorTemplate {
    @Override
    public List<OrderStatus> next() {
        return List.of(OrderStatus.PENDING, OrderStatus.PREPARING, OrderStatus.CANCELED);
    }
}
