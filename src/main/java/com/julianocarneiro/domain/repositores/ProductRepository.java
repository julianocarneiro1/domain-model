package com.julianocarneiro.domain.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julianocarneiro.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
