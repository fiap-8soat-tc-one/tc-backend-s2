package com.fiap.tc.core.application.ports.out.customer;

import com.fiap.tc.domain.entities.Customer;

public interface SaveCustomerOutputPort {
    Customer saveOrUpdate(String document, String name, String email);
}
