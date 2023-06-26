package com.getechnologiesmx.springboot.backend.models.servicedao;

import java.util.List;

import com.getechnologiesmx.springboot.backend.models.entity.Persona;

public interface IDirectorio {
	public List<Persona> findAll();
	//public Persona findbyIdentificacion(String identificacion);
	public Persona findbyId(Long id);
	public Persona save(Persona persona);
	public void delete(Long id);
}
