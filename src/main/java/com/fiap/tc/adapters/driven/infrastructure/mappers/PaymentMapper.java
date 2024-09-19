package com.fiap.tc.adapters.driven.infrastructure.mappers;

import com.fiap.tc.adapters.driven.infrastructure.mappers.base.MapperConstants;
import com.fiap.tc.adapters.driven.infrastructure.mappers.base.MapperEntity;
import com.fiap.tc.adapters.driven.infrastructure.persistence.entities.OrderPaymentEntity;
import com.fiap.tc.core.domain.entities.OrderPayment;
import com.fiap.tc.core.domain.entities.PaymentHistoric;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper
public interface PaymentMapper extends MapperEntity<OrderPaymentEntity, OrderPayment> {

    @Override
    @Mapping(target = "paymentHistoric", source = "entity", qualifiedByName = "buildPaymentHistoric")
    @Mapping(target = "id", source = "order.uuid")
    OrderPayment fromEntity(OrderPaymentEntity entity);

    @Override
    @Mapping(target = "id", ignore = true)
    OrderPaymentEntity toEntity(OrderPayment domain);


    @Named("buildPaymentHistoric")
    default List<PaymentHistoric> buildPaymentHistoric(OrderPaymentEntity entity) {
        return entity.getPaymentHistoric().stream().map(MapperConstants.PAYMENT_HISTORIC_MAPPER::fromEntity).toList();
    }
}

