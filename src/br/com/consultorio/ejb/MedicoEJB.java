package br.com.consultorio.ejb;

import br.com.consultorio.entity.Medico;
import javax.ejb.*;

@Stateless
public class MedicoEJB extends GenericEJB<Medico>{
	
	public MedicoEJB() {
		super(Medico.class);
	}
}
