package com.getechnologiesmx.springboot.backend.models.servicedao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.getechnologiesmx.springboot.backend.models.entity.Persona;

@Service
public class PersonaRepository implements IPersonaRepository{
	
	@Autowired
	private IPersonaRepository personaRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Persona> findAll() {
		return (List<Persona>) personaRepository.findAll();
	}
	
}
