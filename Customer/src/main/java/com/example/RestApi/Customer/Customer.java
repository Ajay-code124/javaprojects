package com.example.RestApi.Customer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	private String id;
	private String name;
	private String email;
	
	public Customer() {
		
	}
	

	public Customer(String id, String name, String email) {
	
		this.id = id;
		this.name = name;
		this.email = email;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
