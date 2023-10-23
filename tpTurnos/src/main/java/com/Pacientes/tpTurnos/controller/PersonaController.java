package com.Pacientes.tpTurnos.controller;

import com.Pacientes.tpTurnos.service.DTOs.persona.request.PersonaRequestDTO;
import com.Pacientes.tpTurnos.service.DTOs.persona.response.PersonaResponseDTO;
import com.Pacientes.tpTurnos.service.PersonaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    PersonaService service;

    public PersonaController(PersonaService service) {
        this.service = service;
    }

    @PostMapping("/")
    public PersonaResponseDTO createPersona(@RequestBody @Valid PersonaRequestDTO persona) throws Exception {
        return this.service.save(persona);
    }

    @GetMapping("/{ciudad}")
    @ResponseStatus(HttpStatus.OK)
    public List<PersonaResponseDTO> getPersonasPorEdad(@PathVariable int edad){
        return this.service.findByEdad(edad);
    }

    @GetMapping("/personas/turnos")
    @ResponseStatus(HttpStatus.OK)
    public List<PersonaResponseDTO> getPersonasConTurno(){
        return this.service.getPersonasConTurno();
    }
    @GetMapping("/personas/turnos/socio")
    @ResponseStatus(HttpStatus.OK)
    public List<PersonaResponseDTO> getPersonasSocioConTurno(){
        return this.service.getPersonasSocioConTurno();
    }
}
