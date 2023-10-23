package com.Pacientes.tpTurnos.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Socio {
    @Id
    private Long ID;
    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    private Persona persona;
    public Socio(){
    }
}
