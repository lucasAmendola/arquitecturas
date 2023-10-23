package com.Pacientes.tpTurnos.repository;

import com.Pacientes.tpTurnos.domain.PersonaTurno;
import com.Pacientes.tpTurnos.domain.PersonaTurnoID;
import jakarta.persistence.Embeddable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaTurnoRepository extends JpaRepository<PersonaTurno, PersonaTurnoID> {
    public List<PersonaTurno> findAll();
}
