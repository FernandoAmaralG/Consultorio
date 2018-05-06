package br.com.consultorio.entity;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.*;

@Entity
public class Medico {
    
    @Id
    @OneToOne
    private Pessoa pessoa;
    
    @NotNull
    private Double CRM;
    
    @ManyToOne
    @JoinColumn(name = "IdEspecializacao")
    private Especializacao especializacao;
    
    @OneToMany(mappedBy = "medico")
    private List<Consulta> consultas;
   
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

    public Especializacao getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(Especializacao especializacao) {
        this.especializacao = especializacao;
    }

    public Double getCRM() {
        return CRM;
    }

    public void setCRM(Double CRM) {
        this.CRM = CRM;
    }
    
}
