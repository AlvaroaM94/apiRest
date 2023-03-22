package com.apiRest.service;

import com.apiRest.model.Persona;
import com.apiRest.repository.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {
    @Autowired
    private DAO dao;
    //devuelve una lista de objetos de tipo Persona
    public List<Persona> getPersonas() {
        return dao.getPersonas();
    }
    //devuelve una Persona pidiendo como parametro id
    public Persona getPersonaById(long id) {
        return dao.getPersonaById(id);
    }
}