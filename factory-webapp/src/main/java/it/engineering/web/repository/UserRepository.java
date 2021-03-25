package it.engineering.web.repository;

import java.util.List;

import it.engineering.web.model.User;

public class UserRepository {
	
	private List<User> users;

	public UserRepository(List<User> users) {
		super();
		this.users = users;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "UserRepository [users=" + users + "]";
	}
	
	
	
	
	

}
