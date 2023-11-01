package com.gd.agenda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gd.agenda.Entity.Contacto;

//Crea un repositorio de Spring Data JPA para gestionar la interacción con la entidad "Contacto"
public interface ContactoRepository extends JpaRepository<Contacto, Long> {
	
}
