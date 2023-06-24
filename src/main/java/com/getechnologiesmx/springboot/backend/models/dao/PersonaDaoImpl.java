package com.getechnologiesmx.springboot.backend.models.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.getechnologiesmx.springboot.backend.models.entity.Persona;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

	@Repository
	public class PersonaDaoImpl implements IPersonaDao {
		
		@PersistenceContext
		private EntityManager em;
		@SuppressWarnings("unchecked")
		@Transactional(readOnly = true)
		@Override
		public List<Persona> findAll() {
			return em.createQuery("from Cliente").getResultList();
		}

}
