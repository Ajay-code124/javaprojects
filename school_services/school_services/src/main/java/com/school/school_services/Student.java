package com.school.school_services;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
 
	@Id
	private int id;
	private String name;
	private int SchoolId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSchoolId() {
		return SchoolId;
	}
	public void setSchoolId(int schoolId) {
		SchoolId = schoolId;
	}
	
	

}
