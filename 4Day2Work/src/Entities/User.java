package Entities;
import Abstract.Entity;

public class User implements Entity {
	int id;
	String Name;
	String Email;
	
	public User(int id, String name, String email) {
		super();
		this.id = id;
		Name = name;
		Email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

}
