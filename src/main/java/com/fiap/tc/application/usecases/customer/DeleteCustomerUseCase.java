package com.fiap.tc.application.usecases.customer;

import com.fiap.tc.application.gateways.CustomerGateway;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DeleteCustomerUseCase {

    private final CustomerGateway customerGateway;

    public DeleteCustomerUseCase(CustomerGateway customerGateway) {
        this.customerGateway = customerGateway;
    }

    public void delete(String document) {
        this.customerGateway.delete(document);
    }
}
