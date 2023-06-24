package com.getechnologiesmx.springboot.backend.models.dao;

import java.util.List;

import com.getechnologiesmx.springboot.backend.models.entity.Persona;

public interface IPersonaDao {
	public List<Persona> findAll();
}
