package com.curso.services;


import com.curso.domains.Medico;
import com.curso.domains.Paciente;
import com.curso.repositories.MedicoRepository;
import com.curso.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.BitSet;

@Service
public class DBService {

    @Autowired
    private PacienteRepository pacienteRepo;

    @Autowired
    private MedicoRepository medicoRepo;

    public void initDB(){

    Medico medico01 = new Medico(0, "Victor", LocalDate.now(), new BigDecimal("19000"));
    Medico medico02  = new Medico(0, "João", LocalDate.now(), new BigDecimal("50000"));
    Paciente paciente01 = new Paciente(0, "Gabriel", LocalDate.now(), new BigDecimal("158"));
    Paciente paciente02 = new Paciente(0, "Chicas", LocalDate.now(), new BigDecimal("10"));


medicoRepo.save(medico01);
medicoRepo.save(medico02);
pacienteRepo.save(paciente01);
pacienteRepo.save(paciente02);
    }



}
