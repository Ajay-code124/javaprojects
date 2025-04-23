package com.example.microservices.Department_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@GetMapping("/{id}")
	public Department getdepartment(@PathVariable Long id) {
		
		return new Department(id, "Engineering", "Bangalore");
	}
	
	

}
