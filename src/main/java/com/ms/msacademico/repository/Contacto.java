package com.ms.msacademico.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity
public class Contacto {
	@Id
	@GeneratedValue
	private int codigoContacto;
	private String tipo;
	private String valor;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="soylafsk")	
	private Persona personaContacto;

	public Contacto() {
		super();
	}

	public Contacto(int codigoContacto, String tipo, String valor,
			Persona personaContacto) {
		super();
		this.codigoContacto = codigoContacto;
		this.tipo = tipo;
		this.valor = valor;
		this.personaContacto = personaContacto;
	}

	public int getCodigoContacto() {
		return codigoContacto;
	}

	public void setCodigoContacto(int codigoContacto) {
		this.codigoContacto = codigoContacto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Persona getPersonaContacto() {
		return personaContacto;
	}

	public void setPersonaContacto(Persona personaContacto) {
		this.personaContacto = personaContacto;
	}
	
	
}
