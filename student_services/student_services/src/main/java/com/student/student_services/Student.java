package com.student.student_services;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private int schoolId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public  int getschoolId() {
		return schoolId;
	}
	public void setSchoolname(int schoolId) {
		this.schoolId = schoolId;
	}
	
	

}
