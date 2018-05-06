package br.com.consultorio.entity;

import javax.persistence.*;
import java.util.*;

@Entity
public class Secretaria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short IdPessoaSecretaria;
    
    @Temporal(TemporalType.DATE)
    private Date DataAdmissao;
    
    @ManyToOne
    @JoinColumn(name = "IdLogin")
    private Login login;
    
    @OneToOne
    private Pessoa pessoa;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public Short getIdPessoaSecretaria() {
        return IdPessoaSecretaria;
    }

    public void setIdPessoaSecretaria(Short IdPessoaSecretaria) {
        this.IdPessoaSecretaria = IdPessoaSecretaria;
    }

    public Date getDataAdmissao() {
        return DataAdmissao;
    }

    public void setDataAdmissao(Date DataAdmissao) {
        this.DataAdmissao = DataAdmissao;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
    
}
