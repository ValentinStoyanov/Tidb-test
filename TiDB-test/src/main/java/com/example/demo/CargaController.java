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
@RequestMapping("carga")
public class CargaController {
	
	
	@Autowired
	private CargaRepository cargaRepository;

	
	@PostMapping("create")
	public @ResponseBody Iterable<Carga> create(@RequestBody List<Carga> carga){
		
		return this.cargaRepository.saveAll(carga);
	}
	
	@PostMapping("deleteAll")
	public @ResponseBody void delete_all() {
		
		this.cargaRepository.deleteAll();
	}
	
	  @GetMapping("getAll")
	  public @ResponseBody Iterable<Carga> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return cargaRepository.findAll();
	  }

}
