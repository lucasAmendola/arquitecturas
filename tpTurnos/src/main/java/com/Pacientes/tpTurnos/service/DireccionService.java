package com.Pacientes.tpTurnos.service;

import com.Pacientes.tpTurnos.domain.Direccion;
import com.Pacientes.tpTurnos.repository.DireccionRepository;
import com.Pacientes.tpTurnos.service.DTOs.direccion.response.DireccionResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("DireccionService")
public class DireccionService {

    DireccionRepository repository;

    public DireccionService(DireccionRepository repository) {
        this.repository = repository;
    }

    public List<DireccionResponseDTO> findAll() {
        List<Direccion> users = this.repository.findAll();
        return users.stream().map(s1-> new DireccionResponseDTO(s1)).collect(Collectors.toList());
    }
}
