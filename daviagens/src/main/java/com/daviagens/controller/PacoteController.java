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

import com.daviagens.model.Pacote;
import com.daviagens.repository.PacoteRepository;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class PacoteController {

	@Autowired
	private PacoteRepository pr;
	
	@GetMapping("/pacotes")
	public List<Pacote> getPacotes(){
		return pr.findAll();
	}
	@GetMapping("/pacotes/{id}")
	public Pacote getPacote(@PathVariable int id){
		return pr.findById(id).get();
	}
	
	@PostMapping("/pacotes")
	public Pacote preatePacote(@RequestBody Pacote pacote) {
		return pr.save(pacote);
	}
	
	@PutMapping("/pacotes/{id}")
	public Pacote updatePacote(@PathVariable int id, @RequestBody Pacote pacote) {
		
		return pr.save(pacote);
	}
	
	@DeleteMapping("/pacotes/{id}")
	public void deletePacote(@PathVariable String id) {
		pr.deleteById(Integer.parseInt(id));
	}
}
