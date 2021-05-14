package eCommerceDemo.core.concrete;

import eCommerceDemo.core.abstracts.RegistrationService;
import eCommerceDemo.entities.concretes.User;
import eCommerceDemo.googleRegister.GoogleRegisterManager;

public class GoogleRegisterManagerAdapter implements RegistrationService {
GoogleRegisterManager googleRegisterManager=new GoogleRegisterManager();


	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		
	}

}
