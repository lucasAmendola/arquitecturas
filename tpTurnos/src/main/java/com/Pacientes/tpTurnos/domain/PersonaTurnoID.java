package com.Pacientes.tpTurnos.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
public class PersonaTurnoID implements Serializable {
    @ManyToOne
    @JoinColumn(name = "Persona_ID")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "Turno_ID")
    private Turno turno;

    public PersonaTurnoID(Persona p, Turno t) {
        super();
        this.turno = t;
        this.persona = p;
    }
}
