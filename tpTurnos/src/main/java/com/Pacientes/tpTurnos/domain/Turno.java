package com.Pacientes.tpTurnos.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Turno {
    @Id
    private Long ID;
    @Column(name = "fecha")
    private Date fecha;


    public Turno() {
    }
}
