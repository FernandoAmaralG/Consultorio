package br.com.consultorio.ejb;

import br.com.consultorio.entity.Pessoa;
import javax.ejb.*;

@Stateless
public class PessoaEJB extends GenericEJB<Pessoa>{

	public PessoaEJB(){
		super(Pessoa.class);
	}
}
