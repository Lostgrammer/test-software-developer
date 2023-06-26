package com.getechnologiesmx.springboot.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.getechnologiesmx.springboot.backend.models.entity.Persona;
import com.getechnologiesmx.springboot.backend.models.servicedao.IDirectorio;

@CrossOrigin(origins = {"http://localhost:4200"})	
@RestController
@RequestMapping("/api")
public class DirectorioRestService {
	
	@Autowired
	private IDirectorio personaRepository;
	
	@GetMapping("/personas")
	public List<Persona> index(){
		return personaRepository.findAll();
	}
}
