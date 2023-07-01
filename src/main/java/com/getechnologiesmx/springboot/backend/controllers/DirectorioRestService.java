package com.getechnologiesmx.springboot.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.getechnologiesmx.springboot.backend.models.entity.Persona;
import com.getechnologiesmx.springboot.backend.models.servicedao.IDirectorio;


@CrossOrigin(origins = {"http://localhost:4200"})	
@RestController
@RequestMapping("/api")
public class DirectorioRestService {
	
	@Autowired
	private IDirectorio directorio;
	
	@GetMapping("/personas")
	public List<Persona> index(){
		return directorio.findAll();
	}
	
	@GetMapping("/personas/{id}")
	public Persona showById(@PathVariable Long id) {
		return directorio.findbyId(id);
	}
	
	@PostMapping("/personas")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona create(@RequestBody Persona persona) {
		return directorio.save(persona);
	}
	
	@PutMapping("/personas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona update(@RequestBody Persona persona, @PathVariable Long id) {
		Persona personaActual = directorio.findbyId(id);
		
		personaActual.setApellidoPaterno(persona.getApellidoPaterno());
		personaActual.setApellidoMaterno(persona.getApellidoMaterno());
		personaActual.setNombre(persona.getNombre());
		personaActual.setIdentificacion(persona.getIdentificacion());
		return directorio.save(personaActual);
	}
	
	@DeleteMapping("/personas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id ) {
		directorio.delete(id);
	}
	
}
