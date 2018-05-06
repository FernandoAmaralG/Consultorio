package br.com.consultorio.entity;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.*;

@Entity
public class Especializacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short IdEspecializacao;
    
    @NotNull(message = "A descrição deverá ter no máximo 60 caractéres")
    @Size(max = 60, message = "Insira uma descrição")
    private String Descricao;
    
    @OneToMany(mappedBy = "especializacao")
    private List<Medico> medicos;

    public Short getIdEspecializacao() {
        return IdEspecializacao;
    }

    public void setIdEspecializacao(Short IdEspecializacao) {
        this.IdEspecializacao = IdEspecializacao;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }
    
}
