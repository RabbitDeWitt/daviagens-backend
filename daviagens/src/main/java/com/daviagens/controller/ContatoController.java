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

import com.daviagens.model.Contato;
import com.daviagens.repository.ContatoRepository;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class ContatoController {

	@Autowired
	private ContatoRepository cr;
	
	@GetMapping("/contatos")
	public List<Contato> getContatos(){
		return cr.findAll();
	}
	
	@PostMapping("/contatos")
	public Contato createContato(@RequestBody Contato contato) {
		return cr.save(contato);
	}
	
	@PutMapping("/contatos/{id}")
	public Contato updateContato(@PathVariable String id, @RequestBody Contato contato) {
		
		return cr.save(contato);
	}
	
	@DeleteMapping("/contatos/{id}")
	public void deleteContato(@PathVariable String id) {
		cr.deleteById(Integer.parseInt(id));
	}
}

