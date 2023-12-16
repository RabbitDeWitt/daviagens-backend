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

import com.daviagens.model.Destino;
import com.daviagens.repository.DestinoRepository;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class DestinoController {

	@Autowired
	private DestinoRepository dr;
	
	@GetMapping("/destinos")
	public List<Destino> getDestinos(){
		return dr.findAll();
	}
	
	@GetMapping("/destinos/{id}")
	public Destino getDestino(@PathVariable int id){
		return dr.findById(id).get();
	}
	
	@PostMapping("/destinos")
	public Destino dreateDestino(@RequestBody Destino destino) {
		return dr.save(destino);
	}
	
	@PutMapping("/destinos/{id}")
	public Destino updateDestino(@PathVariable String id, @RequestBody Destino destino) {
		
		return dr.save(destino);
	}
	
	@DeleteMapping("/destinos/{id}")
	public void deleteDestino(@PathVariable String id) {
		dr.deleteById(Integer.parseInt(id));
	}
}
