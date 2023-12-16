package com.daviagens.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "cliente_id", nullable = false)
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "destino_id", nullable = false)
	private Destino destino;

	@ManyToOne
	@JoinColumn(name = "pacote_id", nullable = false)
	private Pacote pacote;

	@Column(nullable = false)
	private LocalDate dataPartida;

	@Column(nullable = false)
	private LocalDate dataRetorno;

	@Column(nullable = false)
	private double valor;

	public Reserva() {
		super();
	}

	public Reserva(int id, Cliente cliente, Destino destino, Pacote pacote, LocalDate dataPartida,
			LocalDate dataRetorno, double valor) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.destino = destino;
		this.pacote = pacote;
		this.dataPartida = dataPartida;
		this.dataRetorno = dataRetorno;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

	public Pacote getPacote() {
		return pacote;
	}

	public void setPacote(Pacote pacote) {
		this.pacote = pacote;
	}

	public LocalDate getDataPartida() {
		return dataPartida;
	}

	public void setDataPartida(LocalDate dataPartida) {
		this.dataPartida = dataPartida;
	}

	public LocalDate getDataRetorno() {
		return dataRetorno;
	}

	public void setDataRetorno(LocalDate dataRetorno) {
		this.dataRetorno = dataRetorno;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
