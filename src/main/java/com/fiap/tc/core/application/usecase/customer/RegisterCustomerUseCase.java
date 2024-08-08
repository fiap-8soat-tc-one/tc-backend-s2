package com.fiap.tc.core.application.usecase.customer;

import com.fiap.tc.core.domain.entities.Customer;
import com.fiap.tc.adapters.driver.presentation.requests.CustomerRequest;
import com.fiap.tc.core.application.ports.in.customer.RegisterCustomerInputPort;
import com.fiap.tc.core.application.ports.out.customer.SaveCustomerOutputPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RegisterCustomerUseCase implements RegisterCustomerInputPort {

    private final SaveCustomerOutputPort saveCustomerOutputPort;

    public RegisterCustomerUseCase(SaveCustomerOutputPort saveCustomerOutputPort) {
        this.saveCustomerOutputPort = saveCustomerOutputPort;
    }

    @Override
    public Customer register(CustomerRequest customerRequest) {
        return saveCustomerOutputPort.saveOrUpdate(customerRequest.getDocument(), customerRequest.getName(), customerRequest.getEmail());
    }
}