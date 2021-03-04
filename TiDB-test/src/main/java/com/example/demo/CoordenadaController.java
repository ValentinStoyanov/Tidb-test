package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("coordenada")
public class CoordenadaController {

	
	
	@Autowired
	private CoordenadaRepository coordenadaRepository;

	
	@PostMapping("create")
	public @ResponseBody Iterable<Coordenada> create(@RequestBody List<Coordenada> coordenada){
		
		return this.coordenadaRepository.saveAll(coordenada);
	}
	
	@PostMapping("deleteAll")
	public @ResponseBody void delete_all() {
		
		this.coordenadaRepository.deleteAll();
	}
	
	  @GetMapping("getAll")
	  public @ResponseBody Iterable<Coordenada> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return coordenadaRepository.findAll();
	  }
	
	
	
}
