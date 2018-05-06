package br.com.consultorio.controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.consultorio.ejb.MedicoEJB;
import br.com.consultorio.entity.Medico;
import br.com.consultorio.entity.Pessoa;
import br.com.consultorio.ejb.PessoaEJB;
import br.com.consultorio.util.MensagemUtil;

@Named
@RequestScoped
public class MedicoController {

	private Medico medico;
    
    @EJB
    private MedicoEJB medicoEjb;
    
    public MedicoController(){
        medico = new Medico();
    }
    
    public void salvar(){
        String erro = medicoEjb.salvar(medico);
        
        if(erro == null){
            MensagemUtil.success("Salvo com sucesso!");    
        }else{
            MensagemUtil.error(erro);
        }
    }
    
    public List<Medico> listarSexos(){
        return medicoEjb.todos();
    }
    
    public void editar(Medico medico){
        this.medico = medico;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    public void excluir(Medico medico) {
    	String erro = medicoEjb.excluir(medico.getPessoa());
    	if(erro == null) {
    		MensagemUtil.success("Excluído com sucesso!");
    	}else {
    		MensagemUtil.error(erro);
    	}
    }
	
}
