package com.springmvcexample.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class ControllerClass {
	
	@Autowired //to import all the repo interface beans
	CustomerRepo repo;
	
	@GetMapping(value="/") // to get the report request
	public String gethome() {
		return "home.jsp";
	}
	
//@PostMapping(value="/addCustomer") // to post the given details
	
//public String addCustomer(@RequestParam String firstname, @RequestParam String lastname, @RequestParam String email, Model model ) {
		
		//model.addAttribute("firstname", firstname);
		//model.addAttribute("lastname", lastname);
		//model.addAttribute("email", email);
		//return "Success.jsp";
		
	//}
	
	@PostMapping(value="/addCustomer") // to post the given details
     public String addCustomer(Customer data, Model model ) {
		
		repo.save(data);
		model.addAttribute("data", repo.findAll());
		
		return "Success.jsp";
		
	}

}



