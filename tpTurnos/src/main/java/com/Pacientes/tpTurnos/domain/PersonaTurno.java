package com.Pacientes.tpTurnos.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class PersonaTurno {
    @EmbeddedId
    private PersonaTurnoID id;

    public PersonaTurno(PersonaTurnoID id) {
        this.id = id;
    }
}
