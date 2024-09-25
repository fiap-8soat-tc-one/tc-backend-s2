package com.fiap.tc.application.usecases.customer;

import com.fiap.tc.application.gateways.ICustomerGateway;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DeleteCustomerUseCase {

    private final ICustomerGateway customerGateway;

    public DeleteCustomerUseCase(ICustomerGateway customerGateway) {
        this.customerGateway = customerGateway;
    }

    public void delete(String document) {
        this.customerGateway.delete(document);
    }
}
