package com.ms.msacademico.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.msacademico.repository.Persona;

public interface PersonaDao extends JpaRepository<Persona, Integer> {

}
