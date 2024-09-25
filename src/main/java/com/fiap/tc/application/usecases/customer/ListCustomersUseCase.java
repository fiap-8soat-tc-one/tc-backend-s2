package com.fiap.tc.application.usecases.customer;

import com.fiap.tc.application.gateways.ICustomerGateway;
import com.fiap.tc.domain.entities.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ListCustomersUseCase {

    private final ICustomerGateway customerGateway;

    public ListCustomersUseCase(ICustomerGateway customerGateway) {
        this.customerGateway = customerGateway;
    }

    public Page<Customer> list(Pageable pageable) {
        return customerGateway.list(pageable);
    }
}
