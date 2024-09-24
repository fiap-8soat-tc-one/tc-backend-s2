package com.fiap.tc.core.application.ports.in.customer;

import com.fiap.tc.domain.entities.Customer;

public interface LoadCustomerInputPort {
    Customer load(String document);
}
