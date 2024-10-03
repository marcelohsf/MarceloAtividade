package com.curso.domains.dtos;


import com.curso.domains.Paciente;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PacienteDTO {

    private long idPaciente;

    @NotNull(message = "O campo nome não pode ser nulo")
    @NotBlank(message = "O campo nome não pode ser vazio")
    private String nomeP;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento = LocalDate.now();

    @NotNull(message = "O campo internação não pode ser nulo")
    @Digits(integer = 15, fraction = 2)
    private BigDecimal internacao;

    public PacienteDTO() {
    }

    public PacienteDTO(Paciente paciente) {
        this.idPaciente = paciente.getIdPaciente();
        this.nomeP = paciente.getNomeP();
        this.dataNascimento = paciente.getDataNascimento();
        this.internacao = paciente.getInternacao();
    }


    public  long getIdPaciente(){
        return idPaciente;
    }

    public void setIdPaciente(long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public @NotNull(message = "O campo nome não pode ser nulo")@NotBlank(message = "O campo nome não pode ser vazio") String getNomeP(){
        return nomeP;
    }

    public void setNomeP (@NotNull(message = "O campo não pode ser nulo")@NotBlank(message = "O campo não pode ser vazio")String getNomeP){
        this.nomeP = nomeP;
    }


    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public @NotNull(message = "O campo internação não pode ser nulo")@Digits(integer = 15, fraction = 2)BigDecimal getInternacao(){
        return internacao;
    }

    public void setInternacao(@NotNull(message = "O campo internação não pode ser nulo") @Digits(integer = 15, fraction = 2) BigDecimal internacao) {
        this.internacao = internacao;
    }



}
