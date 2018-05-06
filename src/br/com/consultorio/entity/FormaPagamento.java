package br.com.consultorio.entity;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.*;

@Entity
public class FormaPagamento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short IdFormaPagamento;
    
    @NotNull(message = "Insira uma descrição")
    @Size(max = 40, message = "A descrição deve ter no máximo 40 caractéres")
    private String Descricao;
    
    @ManyToMany(mappedBy = "Formas")
    private List<Consulta> Consultas;

    public Short getIdFormaPagamento() {
        return IdFormaPagamento;
    }

    public void setIdFormaPagamento(Short IdFormaPagamento) {
        this.IdFormaPagamento = IdFormaPagamento;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
}
