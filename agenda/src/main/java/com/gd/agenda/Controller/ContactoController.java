package com.gd.agenda.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gd.agenda.Entity.Contacto;
import com.gd.agenda.Exceptions.ContactoNotFoundException;
import com.gd.agenda.Repository.ContactoRepository;

@RestController //Indicar que es un controlador REST. 
@RequestMapping("api/contactos") //establecer la ruta base

public class ContactoController {
	private final ContactoRepository contactoRepository;
	
	@Autowired
	//yecta el repositorio ContactoRepository en el controlador para acceder a las operaciones CRUD.
	public ContactoController(ContactoRepository contactoRepository) {
		this.contactoRepository = contactoRepository;
	}
	

    // Implementa métodos para CRUD (crear, leer, actualizar, borrar)

	@GetMapping
	public List<Contacto> obtenerTodosLosContactos() {
	    return contactoRepository.findAll();
	}

	@PostMapping
	public Contacto crearContacto(@RequestBody Contacto contacto) {
	    return contactoRepository.save(contacto);
	}

	@PutMapping("/{id}")
	public Contacto actualizarContacto(@PathVariable Long id, @RequestBody Contacto contacto) {
	    if (contactoRepository.existsById(id)) {
	        contacto.setId(id);
	        return contactoRepository.save(contacto);
	    } else {
	        throw new ContactoNotFoundException("Contacto no encontrado");
	    }
	}

	@DeleteMapping("/{id}")
	public void eliminarContacto(@PathVariable Long id) {
	    contactoRepository.deleteById(id);
	}

}
