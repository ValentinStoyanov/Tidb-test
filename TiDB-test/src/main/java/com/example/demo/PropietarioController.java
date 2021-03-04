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
@RequestMapping("propietario")
public class PropietarioController {
	
	@Autowired
	private PropietarioRepository propietarioRepository;

	
	@PostMapping("create")
	public @ResponseBody Iterable<Propietario> create(@RequestBody List<Propietario> propietario){
		
		return this.propietarioRepository.saveAll(propietario);
	}
	
	@PostMapping("deleteAll")
	public @ResponseBody void delete_all() {
		
		this.propietarioRepository.deleteAll();
	}
	
	  @GetMapping("getAll")
	  public @ResponseBody Iterable<Propietario> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return propietarioRepository.findAll();
	  }

}
