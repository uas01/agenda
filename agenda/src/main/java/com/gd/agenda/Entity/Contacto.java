package com.gd.agenda.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //indicar que es una entidad JPA
public class Contacto {

	@Id //anotaccion  para decir que es clave primaria y se autogenera
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private Long nombre;
	private Long correo;
	private Long telefono;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNombre() {
		return nombre;
	}
	public void setNombre(Long nombre) {
		this.nombre = nombre;
	}
	public Long getCorreo() {
		return correo;
	}
	public void setCorreo(Long correo) {
		this.correo = correo;
	}
	public Long getTelefono() {
		return telefono;
	}
	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	
	
	
	

}
