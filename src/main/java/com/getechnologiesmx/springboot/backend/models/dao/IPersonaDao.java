package com.getechnologiesmx.springboot.backend.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.getechnologiesmx.springboot.backend.models.entity.Persona;

public interface IPersonaDao extends CrudRepository<Persona, Long>{
	public List<Persona> findAll();
}
