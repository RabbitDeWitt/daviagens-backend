package com.daviagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daviagens.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
