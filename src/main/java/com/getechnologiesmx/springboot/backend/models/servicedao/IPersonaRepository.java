package com.getechnologiesmx.springboot.backend.models.servicedao;

import java.util.List;

import com.getechnologiesmx.springboot.backend.models.entity.Persona;

public interface IPersonaRepository {
	public List<Persona> findAll();
}
