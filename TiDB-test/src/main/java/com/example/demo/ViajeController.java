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
@RequestMapping("viaje")
public class ViajeController {

	
	@Autowired
	private ViajeRepository viajeRepository;

	
	@PostMapping("create")
	public @ResponseBody Iterable<Viaje> create(@RequestBody List<Viaje> viaje){
		
		return this.viajeRepository.saveAll(viaje);
	}
	
	@PostMapping("deleteAll")
	public @ResponseBody void delete_all() {
		
		this.viajeRepository.deleteAll();
	}
	
	  @GetMapping("getAll")
	  public @ResponseBody Iterable<Viaje> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return viajeRepository.findAll();
	  }
}
