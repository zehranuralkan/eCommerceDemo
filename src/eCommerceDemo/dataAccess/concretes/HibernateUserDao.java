package eCommerceDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {
private List<User> users=new ArrayList<User>();
public HibernateUserDao() {
	super();
}
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getFirstName()+" "+user.getLastName()+" eklendi");
		
	}

	@Override
	public void update(User user) {
		User userToUpdate=users.stream().filter(u-> u.getId()==user.getId()).findFirst().orElse(null);
		userToUpdate.setFirstName(user.getFirstName());
		userToUpdate.setLastName(user.getLastName());
		userToUpdate.seteMail(user.geteMail());
		userToUpdate.setPassword(user.getPassword());
		System.out.println(user.getFirstName()+" "+ user.getLastName()+" bilgileri güncellendi");
		
	}

	@Override
	public void delete(User user) {
		User userToDelete=users.stream().filter(u->u.getId()==user.getId()).findFirst().orElse(null);
		users.remove(userToDelete);
		System.out.println(user.getFirstName()+" "+ user.getLastName()+ "kullanýcý silindi");
		
	}



	@Override
	public List<User> getAll() {
		
		return users;
	}

}
