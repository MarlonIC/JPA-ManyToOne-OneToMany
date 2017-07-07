package com.ms.msacademico.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.msacademico.repository.Contacto;

public interface ContactoDao extends JpaRepository<Contacto, Integer> {

}
