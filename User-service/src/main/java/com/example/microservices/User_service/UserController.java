package com.example.microservices.User_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private RestTemplate resttemplate;
	
	
	@GetMapping("/{id}")
	public RestTemplateVO getUserdetailswithDepartment(@PathVariable Long id) {
		
		User user = new User(id,"John",1L);
		Department dept = resttemplate.getForObject("http://localhost:9001/departments/"+user.getDepartmentid(), Department.class);
		RestTemplateVO vo=  new RestTemplateVO();
		vo.setUser(user);
		vo.setDepartment(dept);
		return vo;
		
		
	}
	
}
