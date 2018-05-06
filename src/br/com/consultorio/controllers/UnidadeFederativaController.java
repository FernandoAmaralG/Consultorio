package br.com.consultorio.controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.consultorio.entity.UnidadeFederativa;
import br.com.consultorio.ejb.UnidadeFederativaEJB;
import br.com.consultorio.util.MensagemUtil;

@Named
@RequestScoped
public class UnidadeFederativaController {

	private UnidadeFederativa unidadeFederativa;
    
    @EJB
    private UnidadeFederativaEJB unidadeFederativaEjb;
    
    public UnidadeFederativaController(){
        unidadeFederativa = new UnidadeFederativa();
    }
    
    public void salvar(){
        String erro = unidadeFederativaEjb.salvar(unidadeFederativa);
        
        if(erro == null){
            MensagemUtil.success("Salvo com sucesso!");    
        }else{
            MensagemUtil.error(erro);
        }
    }
    
    public List<UnidadeFederativa> listarUnidadesFederativas(){
        return unidadeFederativaEjb.todos();
    }
    
    public void editar(UnidadeFederativa unidadeFederativa){
        this.unidadeFederativa = unidadeFederativa;
    }

    public UnidadeFederativa getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public void setUnidadeFederativa(UnidadeFederativa unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }
    
    public void excluir(UnidadeFederativa unidadeFederativa) {
    	String erro = unidadeFederativaEjb.excluir(unidadeFederativa.getUF());
    	if(erro == null) {
    		MensagemUtil.success("Excluído com sucesso!");
    	}else {
    		MensagemUtil.error(erro);
    	}
    }
}
