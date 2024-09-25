package com.fiap.tc.application.usecases.order;

import com.fiap.tc.application.gateways.IOrderGateway;
import com.fiap.tc.application.gateways.IPaymentLinkGateway;
import com.fiap.tc.domain.entities.Order;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LoadOrderUseCase {

    private final IOrderGateway orderGateway;
    private final IPaymentLinkGateway paymentLinkGateway;

    public LoadOrderUseCase(IOrderGateway orderGateway, IPaymentLinkGateway paymentLinkGateway) {
        this.orderGateway = orderGateway;
        this.paymentLinkGateway = paymentLinkGateway;
    }

    public Order load(UUID uuid) {
        var order = orderGateway.load(uuid);
        paymentLinkGateway.generate(order).ifPresent(order::setPaymentLink);
        return order;
    }
}







