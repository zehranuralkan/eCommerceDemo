package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface UserService {
void signUp(User user);
//kaydol
void signUpWithGoogle(User user);
//google ile oturum a�
void signIn(String eMail,String password);

}
