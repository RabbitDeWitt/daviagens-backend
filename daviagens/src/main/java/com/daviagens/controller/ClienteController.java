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

import com.daviagens.model.Cliente;
import com.daviagens.repository.ClienteRepository;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class ClienteController {

	@Autowired
	private ClienteRepository cr;
	
	@GetMapping("/clientes")
	public List<Cliente> getClientes(){
		return cr.findAll();
	}
	
	@GetMapping("/clientes/{id}")
	public Cliente getCliente(@PathVariable int id){
		return cr.findById(id).get();
	}
	
	@PostMapping("/clientes")
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return cr.save(cliente);
	}
	
	@PutMapping("/clientes/{id}")
	public Cliente updateCliente(@PathVariable String id, @RequestBody Cliente cliente) {
		
		return cr.save(cliente);
	}
	
	@DeleteMapping("/clientes/{id}")
	public void deleteCliente(@PathVariable String id) {
		cr.deleteById(Integer.parseInt(id));
	}
}
