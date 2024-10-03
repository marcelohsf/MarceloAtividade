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
@Table(name = "medico")
public class Medico {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_medico")
    private long idMedico;

    @NotNull @NotBlank
    private  String nome;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataContratacao;

    @NotNull
    @Digits(integer = 15, fraction = 2)
    private BigDecimal salario;



    public Medico() {
    }

    public Medico(long idMedico, String nome, LocalDate dataContratacao, BigDecimal salario) {
        this.idMedico = idMedico;
        this.nome = nome;
        this.dataContratacao = dataContratacao;
        this.salario = salario;
    }

    public long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(long idMedico) {
        this.idMedico = idMedico;
    }

    public @NotNull @NotBlank String getNome() {
        return nome;
    }

    public void setNome(@NotNull @NotBlank String nome) {
        this.nome = nome;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public @NotNull @Digits(integer = 15, fraction = 2) BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(@NotNull @Digits(integer = 15, fraction = 2) BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medico medico = (Medico) o;
        return idMedico == medico.idMedico && Objects.equals(nome, medico.nome) && Objects.equals(dataContratacao, medico.dataContratacao) && Objects.equals(salario, medico.salario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMedico, nome, dataContratacao, salario);
    }
}
