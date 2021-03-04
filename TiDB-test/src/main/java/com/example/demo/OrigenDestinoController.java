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
@RequestMapping("origendestino")
public class OrigenDestinoController {

	@Autowired
	private OrigenDestinoRepository origendestinoRepository;

	
	@PostMapping("create")
	public @ResponseBody Iterable<OrigenDestino> create(@RequestBody List<OrigenDestino> origendestino){
		
		return this.origendestinoRepository.saveAll(origendestino);
	}
	
	@PostMapping("deleteAll")
	public @ResponseBody void delete_all() {
		
		this.origendestinoRepository.deleteAll();
	}
	
	  @GetMapping("getAll")
	  public @ResponseBody Iterable<OrigenDestino> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return origendestinoRepository.findAll();
	  }
	
}
