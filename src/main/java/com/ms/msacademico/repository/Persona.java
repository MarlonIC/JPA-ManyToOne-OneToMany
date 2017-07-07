package com.ms.msacademico.repository;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Persona {
	@Id
	@GeneratedValue
	private int codigoPersona;
	private String nombre;
	private int edad;
	
	@JsonManagedReference
	@OneToMany(mappedBy="personaContacto", cascade=CascadeType.ALL)	
	private List<Contacto> listaContacto;

	public Persona() {
		super();
	}

	public Persona(int codigoPersona, String nombre, int edad,
			List<Contacto> listaContacto) {
		super();
		this.codigoPersona = codigoPersona;
		this.nombre = nombre;
		this.edad = edad;
		this.listaContacto = listaContacto;
	}

	public int getCodigoPersona() {
		return codigoPersona;
	}

	public void setCodigoPersona(int codigoPersona) {
		this.codigoPersona = codigoPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public List<Contacto> getListaContacto() {
		return listaContacto;
	}

	public void setListaContacto(List<Contacto> listaContacto) {
		this.listaContacto = listaContacto;
	}
	
	
}
