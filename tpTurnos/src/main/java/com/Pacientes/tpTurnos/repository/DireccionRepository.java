package com.Pacientes.tpTurnos.repository;

import com.Pacientes.tpTurnos.domain.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("DireccionRepository")
public interface DireccionRepository extends JpaRepository<Direccion, Long> {

    public List<Direccion> findAll();
}
