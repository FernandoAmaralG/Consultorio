package br.com.consultorio.ejb;

import br.com.consultorio.entity.UnidadeFederativa;
import javax.ejb.*;

@Stateless
public class UnidadeFederativaEJB extends GenericEJB<UnidadeFederativa>{

	public UnidadeFederativaEJB(){
		super(UnidadeFederativa.class);
	}

}
