package com.getechnologiesmx.springboot.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.getechnologiesmx.springboot.backend.models.dao.IPersonaDao;


@Controller
public class PersonaController {
	
	@Autowired
	@Qualifier("personaDaoJPA")
	private IPersonaDao personaDao;
	@RequestMapping(value = "listar", method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo","Listado de personas");
		model.addAttribute("personas",personaDao.findAll());
		return "listar";
	}
}
