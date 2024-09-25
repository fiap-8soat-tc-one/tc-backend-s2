package com.fiap.tc.application.usecases.customer;

import com.fiap.tc.application.gateways.ICustomerGateway;
import com.fiap.tc.domain.entities.Customer;
import org.springframework.stereotype.Service;

@Service
public class LoadCustomerUseCase {

    private final ICustomerGateway customerGateway;

    public LoadCustomerUseCase(ICustomerGateway customerGateway) {
        this.customerGateway = customerGateway;
    }

    public Customer load(String document) {
        return customerGateway.load(document);
    }
}
