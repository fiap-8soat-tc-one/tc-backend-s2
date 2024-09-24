package com.fiap.tc.infrastructure.gateways.mappers;

import com.fiap.tc.infrastructure.persistence.entities.CustomerEntity;
import com.fiap.tc.infrastructure.gateways.mappers.base.MapperEntity;
import com.fiap.tc.domain.entities.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CustomerMapper extends MapperEntity<CustomerEntity, Customer> {

    @Override
    @Mapping(target = "id", source = "uuid")
    Customer fromEntity(CustomerEntity customerEntity);

    @Override
    @Mapping(target = "id", ignore = true)
    CustomerEntity toEntity(Customer customer);

}