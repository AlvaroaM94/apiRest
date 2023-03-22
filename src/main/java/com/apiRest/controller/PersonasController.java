package com.apiRest.controller;

import com.apiRest.model.Persona;
import com.apiRest.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class PersonasController {
    @Autowired
    private PersonaService personaService;
    //metodo get regresa la lista de las personas
    @GetMapping("/personas")
    public List<Persona> getPersonas() {
        return personaService.getPersonas();
    }
    //metodo get regresa los datos de la persona por medio del id de persona
    @GetMapping("/personas/{id}")
    public Persona getPersonaById(@PathVariable("id") long id) {
        return personaService.getPersonaById(id);
    }
}