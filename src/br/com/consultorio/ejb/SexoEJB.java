package br.com.consultorio.ejb;

import br.com.consultorio.entity.Sexo;
import javax.ejb.*;

@Stateless
public class SexoEJB extends GenericEJB<Sexo>{

	public SexoEJB(){
		super(Sexo.class);
	}
	
}
