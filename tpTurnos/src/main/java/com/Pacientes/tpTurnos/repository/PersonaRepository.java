package com.Pacientes.tpTurnos.repository;

import com.Pacientes.tpTurnos.domain.Persona;
import com.Pacientes.tpTurnos.service.DTOs.persona.response.PersonaResponseDTO;
import com.Pacientes.tpTurnos.service.PersonaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
public List<Persona> findAllByAnios(int anios);

}