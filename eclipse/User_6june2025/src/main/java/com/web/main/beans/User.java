package com.web.main.beans;

import jakarta.persistence.Entity;

@Entity
public class User {

	private String email;
	private String pass;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", pass=" + pass + "]";
	}
	
}
