package com.fiap.tc.core.application.ports.in.order;

import com.fiap.tc.domain.entities.Order;
import com.fiap.tc.domain.entities.OrderItem;

import java.util.List;
import java.util.UUID;

public interface RegisterOrderInputPort {
    Order register(UUID idCustomer, List<OrderItem> listOfItems);
}
