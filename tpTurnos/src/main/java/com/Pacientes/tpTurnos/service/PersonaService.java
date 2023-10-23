package com.Pacientes.tpTurnos.service;

import com.Pacientes.tpTurnos.domain.Persona;
import com.Pacientes.tpTurnos.domain.PersonaTurno;
import com.Pacientes.tpTurnos.domain.Socio;
import com.Pacientes.tpTurnos.repository.PersonaRepository;
import com.Pacientes.tpTurnos.repository.PersonaTurnoRepository;
import com.Pacientes.tpTurnos.repository.SocioRepository;
import com.Pacientes.tpTurnos.service.DTOs.persona.request.PersonaRequestDTO;
import com.Pacientes.tpTurnos.service.DTOs.persona.response.PersonaResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaService {
    PersonaRepository repository;
    PersonaTurnoRepository PTrepository;
    SocioRepository socioRepository;

    public PersonaService(PersonaRepository repository, PersonaTurnoRepository PTrepository,  SocioRepository socioRepository) {
        this.repository = repository;
        this.PTrepository = PTrepository;
        this.socioRepository = socioRepository;
    }

    public PersonaResponseDTO save(PersonaRequestDTO persona) throws Exception {
        if(!this.repository.existsById(persona.getID())){
            Persona newPerson = this.repository.save(new Persona(persona.getID(), persona.getNombre(), persona.getAnios(), persona.getDomicilio()));
            return new PersonaResponseDTO(newPerson);
        }
        throw new Exception("La persona que quiere ingresar ya existe");
    }

    public List<PersonaResponseDTO> findByEdad(int edad) {
        List<Persona> personas = this.repository.findAllByAnios(edad);
        return personas.stream().map(p1-> new PersonaResponseDTO(p1)).collect(Collectors.toList());
    }

    public List<PersonaResponseDTO> getPersonasConTurno(){
        List<PersonaTurno> personasConTurno = this.PTrepository.findAll();
        return personasConTurno.stream().map(p1->new PersonaResponseDTO(p1.getId().getPersona())).collect(Collectors.toList());
    }

    public List<PersonaResponseDTO> getPersonasSocioConTurno() {
        List<Socio> socios = this.socioRepository.findAllSociosConTurno();
        return socios.stream().map(s1-> new PersonaResponseDTO(s1.getPersona())).collect(Collectors.toList());
    }
}
