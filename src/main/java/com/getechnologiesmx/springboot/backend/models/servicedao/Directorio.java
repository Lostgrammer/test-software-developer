package com.getechnologiesmx.springboot.backend.models.servicedao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.getechnologiesmx.springboot.backend.models.dao.PersonaRepository;
import com.getechnologiesmx.springboot.backend.models.entity.Persona;

@Service
public class Directorio implements IDirectorio{
	
	@Autowired
	private PersonaRepository personaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Persona> findAll() {
		return (List<Persona>) personaDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Persona findbyIdentificacion(String identificacion) {
		return personaDao.findbyIdentificacion(identificacion);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Persona findbyId(Long id) {
		return personaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Persona save(Persona persona) {
		return personaDao.save(persona);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		personaDao.delete(null);
		
	}
}
