package br.com.consultorio.entity;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.*;

@Entity
public class Sexo {
    
    @Id
    @Size(max = 1, message = "O Sexo deverá ser representado por uma sigla")
    private String SiglaSexo;
    
    @NotNull(message = "Insira uma descrição")
    @Size(max = 12, message = "A descrição deverá ter no máximo 12 caracteres")
    private String Descricao;

    @OneToMany(mappedBy = "sexo")
    private List<Pessoa> pessoas;

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
    public String getSiglaSexo() {
        return SiglaSexo;
    }

    public void setSiglaSexo(String SiglaSexo) {
        this.SiglaSexo = SiglaSexo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
    
}
