package com.getechnologiesmx.springboot.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.getechnologiesmx.springboot.backend.models.entity.Persona;
import com.getechnologiesmx.springboot.backend.models.servicedao.IPersonaRepository;


@RestController
@RequestMapping("/api")
public class PersonaRestController {
	
	@Autowired
	private IPersonaRepository personaRepository;//importamos la interfaz
	
	@GetMapping("/clientes")
	public List<Persona> index(){
		return personaRepository.findAll();
	}
}
