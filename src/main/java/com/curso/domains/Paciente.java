package com.curso.domains;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "paciente")
public class Paciente {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_paciente")
    private long idPaciente;

    @NotNull @NotBlank
    private String nomeP;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;

    @NotNull
    @Digits(integer = 15, fraction = 2)
    private BigDecimal internacao;

    public Paciente() {
    }

    public Paciente(long idPaciente, String nomeP, LocalDate dataNascimento, BigDecimal internacao) {
        this.idPaciente = idPaciente;
        this.nomeP = nomeP;
        this.dataNascimento = dataNascimento;
        this.internacao = internacao;
    }

    public long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public @NotNull @NotBlank String getNomeP() {
        return nomeP;
    }

    public void setNomeP(@NotNull @NotBlank String nomeP) {
        this.nomeP = nomeP;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public @NotNull @Digits(integer = 15, fraction = 2) BigDecimal getInternacao() {
        return internacao;
    }

    public void setInternacao(@NotNull @Digits(integer = 15, fraction = 2) BigDecimal internacao) {
        this.internacao = internacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return idPaciente == paciente.idPaciente && Objects.equals(nomeP, paciente.nomeP) && Objects.equals(dataNascimento, paciente.dataNascimento) && Objects.equals(internacao, paciente.internacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPaciente, nomeP, dataNascimento, internacao);
    }
}
