package com.example.microservices.User_service;

public class User {

	private Long id;
	private String name;
	private Long departmentid;
	
	public User() {
		
	}
	public User(Long id, String name, Long departmentid) {
		
		this.id = id;
		this.name = name;
		this.departmentid = departmentid;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(Long departmentid) {
		this.departmentid = departmentid;
	}
	
	
}
