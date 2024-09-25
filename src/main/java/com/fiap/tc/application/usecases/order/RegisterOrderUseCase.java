package com.fiap.tc.application.usecases.order;

import com.fiap.tc.application.gateways.IOrderGateway;
import com.fiap.tc.application.gateways.IPaymentLinkGateway;
import com.fiap.tc.domain.entities.Order;
import com.fiap.tc.domain.entities.OrderItem;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RegisterOrderUseCase {
    private final IOrderGateway orderGateway;
    private final IPaymentLinkGateway paymentLinkGateway;

    public RegisterOrderUseCase(IOrderGateway orderGateway, IPaymentLinkGateway paymentLinkGateway) {
        this.orderGateway = orderGateway;
        this.paymentLinkGateway = paymentLinkGateway;
    }

    public Order register(UUID idCustomer, List<OrderItem> listOfItems) {
        var order = orderGateway.register(idCustomer, listOfItems);
        paymentLinkGateway.generate(order).ifPresent(order::setPaymentLink);
        return order;
    }
}
