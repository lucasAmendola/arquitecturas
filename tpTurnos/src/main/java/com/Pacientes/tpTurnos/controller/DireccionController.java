package com.Pacientes.tpTurnos.controller;

import com.Pacientes.tpTurnos.service.DTOs.direccion.response.DireccionResponseDTO;
import com.Pacientes.tpTurnos.service.DireccionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/direcciones")
public class DireccionController {

    DireccionService service;

    public DireccionController(DireccionService service) {
        this.service = service;
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<DireccionResponseDTO> getAllDirecciones(){
        return this.service.findAll();
    }
}
