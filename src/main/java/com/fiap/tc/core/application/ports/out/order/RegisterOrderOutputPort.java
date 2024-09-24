package com.fiap.tc.core.application.ports.out.order;

import com.fiap.tc.domain.entities.Order;
import com.fiap.tc.domain.entities.OrderItem;

import java.util.List;
import java.util.UUID;

public interface RegisterOrderOutputPort {
    Order save(UUID customerId, List<OrderItem> itemsRequest);
}


