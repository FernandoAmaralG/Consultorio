package br.com.consultorio.entity;

import javax.persistence.*;
import java.util.*;

@Entity
public class Consulta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdConsulta;
    
    @Temporal(TemporalType.DATE)
    private Date DataConsulta;
    
    @ManyToOne
    @JoinColumn(name = "IdPessoaMedico")
    private Medico medico;
    
    @ManyToOne
    @JoinColumn(name = "IdPessoaPaciente")
    private Paciente paciente;

    @ManyToMany
    @JoinTable(name = "ConsultaPagamento",
               joinColumns = @JoinColumn(name = "IdConsulta"),
               inverseJoinColumns = @JoinColumn(name = "IdFormaPagamento"))
    private List<FormaPagamento> Formas;
    
    public Integer getIdConsulta() {
        return IdConsulta;
    }

    public void setIdConsulta(Integer IdConsulta) {
        this.IdConsulta = IdConsulta;
    }

    public Date getDataConsulta() {
        return DataConsulta;
    }

    public void setDataConsulta(Date DataConsulta) {
        this.DataConsulta = DataConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
}
