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
@RequestMapping("camion")
public class CamionController {
	
	@Autowired
	private CamionRepository camionRepository;

	
	@PostMapping("create")
	public @ResponseBody Iterable<Camion> create(@RequestBody List<Camion> camion){
		
		return this.camionRepository.saveAll(camion);
	}
	
	@PostMapping("deleteAll")
	public @ResponseBody void delete_all() {
		
		this.camionRepository.deleteAll();
	}
	
	  @GetMapping("getAll")
	  public @ResponseBody Iterable<Camion> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return camionRepository.findAll();
	  }
	
	
}
