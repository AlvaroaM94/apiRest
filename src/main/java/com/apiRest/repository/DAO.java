package com.apiRest.repository;

import com.apiRest.model.Persona;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DAO {
    public static List<Persona> personas = new ArrayList<>();
    static {
        personas.add(new Persona(1, "ALEJANDRO", "RUIZ", "DAWEF49874", "AR68465", 22, "M", "Mexicana"));
        personas.add(new Persona(2, "KARLA", "SANCHEZ", "FASDF74984", "KS64846", 25, "F", "Mexicana"));
        personas.add(new Persona(3, "PEDRO", "LOPEZ", "JYSD56841", "PL4684+", 35, "M", "COLOMBIANA"));
        personas.add(new Persona(4, "RAUL", "RAMIREZ", "WEGSD56841", "RR4684+", 60, "M", "MEXICANA"));
        personas.add(new Persona(5, "MARIO", "ROLDAN", "JUTD56841", "MJ4684+", 44, "M", "MEXICANA"));
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public Persona getPersonaById(long id) {
        return personas.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
