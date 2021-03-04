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
@RequestMapping("remolque")
public class RemolqueController {
	
	@Autowired
	private RemolqueRepository remolqueRepository;

	
	@PostMapping("create")
	public @ResponseBody Iterable<Remolque> create(@RequestBody List<Remolque> remolque){
		
		return this.remolqueRepository.saveAll(remolque);
	}
	
	@PostMapping("deleteAll")
	public @ResponseBody void delete_all() {
		
		this.remolqueRepository.deleteAll();
	}
	
	  @GetMapping("getAll")
	  public @ResponseBody Iterable<Remolque> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return remolqueRepository.findAll();
	  }


}
