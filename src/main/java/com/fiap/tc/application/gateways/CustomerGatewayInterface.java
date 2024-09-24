package com.fiap.tc.application.gateways;

import com.fiap.tc.domain.entities.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerGatewayInterface {

    Customer load(String document);

    void delete(String document);

    Customer register(String document, String name, String email);

    Page<Customer> list(Pageable pageable);
}
