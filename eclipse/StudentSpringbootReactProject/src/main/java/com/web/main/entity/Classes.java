package com.web.main.entity;

import jakarta.persistence.*;

@Entity
public class Classes {

	@Id
	private String className;
	private String classTeacher;
	private String sub1name, sub2name, sub3name, sub4name, sub5name;
	private String sub1teacher, sub2teacher, sub3teacher, sub4teacher, sub5teacher;
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassTeacher() {
		return classTeacher;
	}
	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}
	public String getSub1name() {
		return sub1name;
	}
	public void setSub1name(String sub1name) {
		this.sub1name = sub1name;
	}
	public String getSub2name() {
		return sub2name;
	}
	public void setSub2name(String sub2name) {
		this.sub2name = sub2name;
	}
	public String getSub3name() {
		return sub3name;
	}
	public void setSub3name(String sub3name) {
		this.sub3name = sub3name;
	}
	public String getSub4name() {
		return sub4name;
	}
	public void setSub4name(String sub4name) {
		this.sub4name = sub4name;
	}
	public String getSub5name() {
		return sub5name;
	}
	public void setSub5name(String sub5name) {
		this.sub5name = sub5name;
	}
	public String getSub1teacher() {
		return sub1teacher;
	}
	public void setSub1teacher(String sub1teacher) {
		this.sub1teacher = sub1teacher;
	}
	public String getSub2teacher() {
		return sub2teacher;
	}
	public void setSub2teacher(String sub2teacher) {
		this.sub2teacher = sub2teacher;
	}
	public String getSub3teacher() {
		return sub3teacher;
	}
	public void setSub3teacher(String sub3teacher) {
		this.sub3teacher = sub3teacher;
	}
	public String getSub4teacher() {
		return sub4teacher;
	}
	public void setSub4teacher(String sub4teacher) {
		this.sub4teacher = sub4teacher;
	}
	public String getSub5teacher() {
		return sub5teacher;
	}
	public void setSub5teacher(String sub5teacher) {
		this.sub5teacher = sub5teacher;
	}
	
}
