package com.web.main.beans;

public class StudentBeans {

	int roll;
	String name;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Roll: " + roll);
		System.out.println("Name: " + name);
	}
	
}
