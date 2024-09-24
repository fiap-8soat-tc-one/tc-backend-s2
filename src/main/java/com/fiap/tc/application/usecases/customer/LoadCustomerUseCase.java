package com.fiap.tc.application.usecases.customer;

import com.fiap.tc.application.gateways.CustomerGateway;
import com.fiap.tc.domain.entities.Customer;
import org.springframework.stereotype.Service;

@Service
public class LoadCustomerUseCase {

    private final CustomerGateway customerGateway;

    public LoadCustomerUseCase(CustomerGateway customerGateway) {
        this.customerGateway = customerGateway;
    }

    public Customer load(String document) {
        return customerGateway.load(document);
    }
}
