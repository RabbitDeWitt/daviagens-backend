package com.daviagens.model;

import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, unique = true)
	private String nome;

	@Column(nullable = true)	
	private LocalDate dataNasc;

	@Column(nullable = false)
	private String telefone;

	@Column(nullable = false, unique = true)
	private String numPassaporte;

	public Cliente() {
		super();
	}

	public Cliente(int id, String nome, LocalDate dataNasc, String telefone, String numPassaporte) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
		this.numPassaporte = numPassaporte;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNumPassaporte() {
		return numPassaporte;
	}

	public void setNumPassaporte(String numPassaporte) {
		this.numPassaporte = numPassaporte;
	}

}
