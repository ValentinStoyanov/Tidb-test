package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping("conductor")
public class ConductorController {
	
	@Autowired
	private ConductorRepository conductorRepository;

	
	@PostMapping("create")
	public @ResponseBody Iterable<Conductor> create(@RequestBody List<Conductor> conductor){
		
		return this.conductorRepository.saveAll(conductor);
	}
	
	@PostMapping("deleteAll")
	public @ResponseBody void delete_all() {
		
		this.conductorRepository.deleteAll();
	}
	
	  @GetMapping("getAll")
	  public @ResponseBody Iterable<Conductor> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return conductorRepository.findAll();
	  }

}
