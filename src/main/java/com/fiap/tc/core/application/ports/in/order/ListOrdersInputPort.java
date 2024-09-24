package com.fiap.tc.core.application.ports.in.order;

import com.fiap.tc.domain.entities.OrderList;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ListOrdersInputPort {
    Page<OrderList> list(Pageable pageable);
}
