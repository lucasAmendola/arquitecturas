package com.Pacientes.tpTurnos.service.DTOs.direccion.response;

import com.Pacientes.tpTurnos.domain.Direccion;

public class DireccionResponseDTO {
    private Long ID;
    private String calle;
    private String ciudad;
    public DireccionResponseDTO(Direccion s1) {
        this.ID = s1.getID();
        this.calle = s1.getCalle();
        this.ciudad = s1.getCiudad();
    }
}
