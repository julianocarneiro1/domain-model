package com.julianocarneiro.domain.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julianocarneiro.domain.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
