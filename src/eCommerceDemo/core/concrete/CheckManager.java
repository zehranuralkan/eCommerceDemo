package eCommerceDemo.core.concrete;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import eCommerceDemo.core.abstracts.CheckService;

public class CheckManager implements CheckService{

	@Override
	public boolean checkFirstName(String firstName) {
		if(firstName.length()<2) {
			System.out.println("�sminiz iki karakterden az olamaz.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkLastName(String lastName) {
		if(lastName.length()<2) {
			System.out.println("Soyisminiz iki karakterden az olamaz.");
			return false;
		}return false;
	}

	@Override
	public boolean checkEMail(String eMail) {
String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(eMail);
		if(eMail.isEmpty()) {
			//bo� girilme durumu
			System.out.println("Mail adresi alan�n� doldurunuz.");
			return false;
		}
		else if(matcher.matches()) {
			return true;
		}
		else {
			System.out.println("Ge�ersiz e-mail adresi.");
		return false;
		}
	}

	@Override
	public boolean checkPassword(String password) {
		if(password.isEmpty()) {
			System.out.println("�ifre alan�n� doldurunuz");
			return false;
		}
		else if(password.length()<6) {
			System.out.println("Ge�ersiz �ifre girdiniz.");
			return false;
		}
		return true;
		
	}

}
