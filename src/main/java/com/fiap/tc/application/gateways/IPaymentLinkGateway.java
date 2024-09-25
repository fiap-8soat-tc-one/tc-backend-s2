package com.fiap.tc.application.gateways;

import com.fiap.tc.domain.entities.Order;

import java.util.Optional;

public interface IPaymentLinkGateway {
    Optional<String> generate(Order order);

}
