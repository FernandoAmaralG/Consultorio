package br.com.consultorio.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Endereco {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdEndereco;
    
    @NotNull(message = "Insira um Logradouro")
    @Size(max = 120, message = "Logradouro dever· ter no m·ximo 120 caracteres")
    private String Logradouro;
    
    @NotNull(message = "Insira um Bairro")
    @Size(max = 100, message = "Bairro devera ter no maximo 100 caracteres")
    private String Bairro;
    
    @NotNull(message = "Insira um CEP v√°lido")
    private Integer CEP;
    
    @NotNull(message = "Insira um n√∫mero")
    private Short Numero;

    @ManyToOne
    @JoinColumn(name = "IdCidade")
    private Cidade cidade;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    public Integer getIdEndereco() {
        return IdEndereco;
    }

    public void setIdEndereco(Integer IdEndereco) {
        this.IdEndereco = IdEndereco;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public Integer getCEP() {
        return CEP;
    }

    public void setCEP(Integer CEP) {
        this.CEP = CEP;
    }

    public Short getNumero() {
        return Numero;
    }

    public void setNumero(Short Numero) {
        this.Numero = Numero;
    }
    
    
}
