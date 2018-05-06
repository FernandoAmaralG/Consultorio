package br.com.consultorio.ejb;

import br.com.consultorio.entity.Login;
import javax.ejb.*;

@Stateless
public class LoginEJB extends GenericEJB<Login>{

	public LoginEJB(){
		super(Login.class);
	}

}
