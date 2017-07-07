package com.ms.msacademico.business;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.msacademico.dao.PersonaDao;
import com.ms.msacademico.repository.Persona;

@Service
public class PersonaBusiness {
	@Autowired
	private PersonaDao personadao;
	
	public List<Persona> listaPersona() {
		return personadao.findAll();
	}
	
	public Persona guardarPersona(Persona persona) {
		personadao.save(persona);
		return persona;
	}
	
	/*public List<Persona> eliminarPersona(Persona persona) {
		personadao.delete(persona);
		return personadao.findAll();
	}*/
}
