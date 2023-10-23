package com.Pacientes.tpTurnos.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor

@Entity
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    @Column(name = "calle")
    private String calle;
    @Column(name = "ciudad")
    private String ciudad;
    @OneToMany(mappedBy = "domicilio", fetch = FetchType.LAZY)
    private List<Persona> habitantes;

    public Direccion() {
    }
    public Direccion(List<Persona> habitantes) {
        this.habitantes = habitantes;
    }
}
