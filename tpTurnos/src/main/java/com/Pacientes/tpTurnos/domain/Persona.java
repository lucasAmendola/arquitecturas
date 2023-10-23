package com.Pacientes.tpTurnos.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Persona {
    @Id
    private Long ID;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "anios")
    private int anios;
    @Column(name = "domicilio")
    @ManyToOne
    private Direccion domicilio;

    public Persona() {
    }

    public Direccion getDomicilio() {
        return domicilio;
    }
}
