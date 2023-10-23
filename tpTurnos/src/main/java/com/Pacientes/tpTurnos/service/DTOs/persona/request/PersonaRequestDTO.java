package com.Pacientes.tpTurnos.service.DTOs.persona.request;

import com.Pacientes.tpTurnos.domain.Direccion;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PersonaRequestDTO {
    private Long ID;
    private String nombre;
    private int anios;
    private Direccion domicilio;
}
