package com.stud;

public class ValidateUser {
	private String user;
	private String pass;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public boolean validate(String u1, String p1) {
		if(u1.equals(user) && p1.equals(pass))
			return true;
		else
			return false;
	}
	
}
