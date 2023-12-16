package com.daviagens.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.daviagens.model.Reserva;
import com.daviagens.repository.ReservaRepository;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class ReservaController {
	
	@Autowired
	private ReservaRepository rr;
	
	@GetMapping("/reservas")
	public List<Reserva> getReservas(){
		return rr.findAll();
	}
	
	@PostMapping("/reservas")
	public Reserva createReserva(@RequestBody Reserva reserva) {
		return rr.save(reserva);
	}
	
	@PutMapping("/reservas/{id}")
	public Reserva updateReserva(@PathVariable String id, @RequestBody Reserva reserva) {
		return rr.save(reserva);
	}

	@DeleteMapping("/reservas/{id}")
	public void deleteReserva(@PathVariable String id) {
		rr.deleteById(Integer.parseInt(id));
	}
}
