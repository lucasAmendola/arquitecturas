package com.Pacientes.tpTurnos.service.DTOs.persona.response;

import com.Pacientes.tpTurnos.domain.Persona;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class PersonaResponseDTO {

    private Long ID;
    private String nombre;
    private int anios;

    public PersonaResponseDTO(Persona persona) {
        this.ID = persona.getID();
        this.nombre = persona.getNombre();
        this.anios = persona.getAnios();
    }
}
