package eCommerceDemo.dataAccess.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.User;

public interface UserDao {
void add(User user);
void update(User user);
void delete(User user);
List<User> getAll();
}
