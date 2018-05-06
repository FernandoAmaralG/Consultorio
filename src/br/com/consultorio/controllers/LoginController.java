package br.com.consultorio.controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.consultorio.ejb.LoginEJB;
import br.com.consultorio.entity.Login;
import br.com.consultorio.util.MensagemUtil;

@Named
@RequestScoped
public class LoginController {
	
	private Login login;
    
    @EJB
    private LoginEJB loginEjb;
    
    public LoginController(){
        login = new Login();
    }
    
    public void salvar(){
        String erro = loginEjb.salvar(login);
        
        if(erro == null){
            MensagemUtil.success("Salvo com sucesso!");    
        }else{
            MensagemUtil.error(erro);
        }
    }
    
    public List<Login> listarLogins(){
        return loginEjb.todos();
    }
    
    public void editar(Login login){
        this.login = login;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
    
    public void excluir(Login login) {
    	String erro = loginEjb.excluir(login.getIdLogin());
    	if(erro == null) {
    		MensagemUtil.success("Excluído com sucesso!");
    	}else {
    		MensagemUtil.error(erro);
    	}
    }

}
