package com.getechnologiesmx.springboot.backend.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.getechnologiesmx.springboot.backend.models.entity.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Long>{
	public List<Persona> findAll();
	public Persona findbyIdentificacion(String identificacion);
}
