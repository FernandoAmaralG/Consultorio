package br.com.consultorio.entity;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.*;

@Entity
public class Paciente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short IdPessoaPaciente;
    
    @NotNull(message = "Insira um CPF válido")
    private Double CPF;

    @OneToMany(mappedBy = "paciente")
    private List<Consulta> consultas;

    @OneToOne
    private Pessoa pessoa;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
        
    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
        
    public Short getIdPessoaPaciente() {
        return IdPessoaPaciente;
    }

    public void setIdPessoaPaciente(Short IdPessoaPaciente) {
        this.IdPessoaPaciente = IdPessoaPaciente;
    }

    public Double getCPF() {
        return CPF;
    }

    public void setCPF(Double CPF) {
        this.CPF = CPF;
    }
    
    
}
