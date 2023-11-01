package com.gd.agenda.Exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ContactoNotFoundException extends RuntimeException {
    public ContactoNotFoundException(String mensaje) {
        super(mensaje);
    }
}
