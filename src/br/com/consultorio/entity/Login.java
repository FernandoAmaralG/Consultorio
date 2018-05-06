package br.com.consultorio.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Login {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short IdLogin;
    
    @NotNull
    @Size(max = 120, message = "Insira um usuário")
    private String Usuario;
    
    @NotNull
    @Size(max = 60, message = "Insira uma senha")
    private String Senha;

    public Short getIdLogin() {
        return IdLogin;
    }

    public void setIdLogin(Short IdLogin) {
        this.IdLogin = IdLogin;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    
}
