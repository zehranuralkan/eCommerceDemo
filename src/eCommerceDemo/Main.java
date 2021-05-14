package eCommerceDemo;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.core.concrete.CheckManager;
import eCommerceDemo.core.concrete.GoogleRegisterManagerAdapter;
import eCommerceDemo.dataAccess.concretes.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		   UserService userManager=new UserManager(new CheckManager(),new HibernateUserDao());
		  
		   User user=new User(1,"zehra nur","alkan","z.nuralkan@gmail.com","1");
		   User user1=new User(2,"bulut","aras","b@gmail.com","1");
		   userManager.signUp(user);
		   userManager.signUp(user1);
		   userManager.signIn("z.nuralkan@gmail.com", "1");
		   UserManager userManager1 = new UserManager(new CheckManager(), new HibernateUserDao(), new GoogleRegisterManagerAdapter()); 
		   userManager1.signUpWithGoogle(user);
		   
		   userManager.signIn("z.nuralkan@gmail.com","1");
	}
}
