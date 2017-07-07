package com.ms.msacademico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ms.msacademico.business.PersonaBusiness;
import com.ms.msacademico.repository.Contacto;
import com.ms.msacademico.repository.Persona;

@RestController
@RequestMapping(value="/persona")
public class PersonaController {
	@Autowired
	private PersonaBusiness personabusiness;
	
	@RequestMapping(value="/listar", method=RequestMethod.GET)
	public List<Persona> listarAlumnos() {
		return personabusiness.listaPersona();
	}
	
	@RequestMapping(value="/guardar", method=RequestMethod.POST)
	public Persona guardarPersona(@RequestBody Persona persona) {
		// Creando las Relaciones HIJOS con su PADRE
		List<Contacto> listaContacto = persona.getListaContacto();		
		for (Contacto contacto : listaContacto) {
			contacto.setPersonaContacto(persona);
		}
		
		return personabusiness.guardarPersona(persona);
	}
	
	/*@RequestMapping(value="/eliminar", method=RequestMethod.DELETE)
	public List<Persona> eliminarPersona(@RequestBody Persona persona) {
		return personabusiness.eliminarPersona(persona);
	}*/
	
}
