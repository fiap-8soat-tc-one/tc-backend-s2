package com.fiap.tc.adapter.repository;

import com.fiap.tc.adapter.repository.entity.OrderEntity;
import com.fiap.tc.core.domain.model.enums.OrderStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {

    OrderEntity findByUuid(UUID uuid);

    Page<OrderEntity> findByStatusIn(List<OrderStatus> status, Pageable pageable);
}