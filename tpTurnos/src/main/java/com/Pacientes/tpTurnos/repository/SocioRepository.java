package com.Pacientes.tpTurnos.repository;

import com.Pacientes.tpTurnos.domain.Socio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SocioRepository extends JpaRepository<Socio, Long> {
    @Query("select ps.id.persona.ID ,ps.id.persona.nombre, ps.id.persona.anios\n" +
            "from PersonaTurno ps\n" +
            "join Socio s on ps.id.persona.ID = s.persona.ID")
    List<Socio> findAllSociosConTurno();
}
