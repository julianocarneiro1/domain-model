package com.julianocarneiro.domain.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julianocarneiro.domain.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
