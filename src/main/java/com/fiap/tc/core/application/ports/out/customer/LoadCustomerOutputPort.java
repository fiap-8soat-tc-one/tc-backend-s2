package com.fiap.tc.core.application.ports.out.customer;

import com.fiap.tc.domain.entities.Customer;

public interface LoadCustomerOutputPort {
    Customer load(String document);
}
