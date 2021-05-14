package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.core.abstracts.CheckService;
import eCommerceDemo.core.abstracts.RegistrationService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService{
private CheckService checkService;
private UserDao userDao;
private RegistrationService registrationService;
public UserManager(CheckService checkService, UserDao userDao) {
	super();
	this.checkService=checkService;
	this.userDao=userDao;
}
public UserManager(CheckService checkService, UserDao userDao, RegistrationService registrationService) {
	super();
	this.checkService = checkService;
	this.userDao = userDao;
	this.registrationService = registrationService;
}

	@Override
	public void signUp(User user) {
		if(checkService.checkFirstName(user.getFirstName())
				&&checkService.checkLastName(user.getLastName())
				&&checkService.checkEMail(user.geteMail())
				&&checkService.checkPassword(user.getPassword()) ) {
			userDao.add(user);
			
			System.out.println(user.getFirstName() + " kay�t tamamland�.");
			System.out.println("A confirmation e-mail has been sent. " + user.geteMail());
		}
	}

	@Override
	public void signUpWithGoogle(User user) {
		registrationService.register( user);
		System.out.println("Google hesab� ile �yelik ger�ekle�mi�tir : " + user.geteMail());
		
	}

	@Override
	public void signIn(String eMail, String password) {
		for(int i = 0;i < userDao.getAll().size(); i++) {
			if (userDao.getAll().get(i).geteMail().equals(eMail)
					&&userDao.getAll().get(i).getPassword().equals(password)) {
				System.out.println("Oturum a�ma ba�ar�l�.");
				return;
			}
			System.out.println("L�tfen bilgilerinizi kontrol ediniz.");

		}
			}
}
		
