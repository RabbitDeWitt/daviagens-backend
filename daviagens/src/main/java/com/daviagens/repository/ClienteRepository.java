package com.daviagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daviagens.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
