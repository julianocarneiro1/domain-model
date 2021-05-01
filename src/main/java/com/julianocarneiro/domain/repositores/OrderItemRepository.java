package com.julianocarneiro.domain.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julianocarneiro.domain.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
