package eCommerceDemo.entities.concretes;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String eMail;
	private String password;
	public User() {
		super();
	}
	public User(int id, String eMail) {
		super();
		this.setId(id);
		this.seteMail(eMail);
	}
	public User(int id,String firstName,String lastName, String eMail,String password) {
		super();
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.seteMail(eMail);
		this.setPassword(password);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

		
}
