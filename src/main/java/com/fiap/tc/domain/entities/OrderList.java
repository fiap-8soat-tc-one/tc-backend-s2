package com.fiap.tc.domain.entities;

import com.fiap.tc.domain.enums.OrderStatus;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class OrderList {
    private UUID id;
    private String orderNumber;
    private OrderStatus status;
    private Long waitTime;
    private LocalDateTime updatedDate;
}
