package com.web.main.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

	@Id
	private int id;
    private String email;
    private String pass;
    
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
    
}