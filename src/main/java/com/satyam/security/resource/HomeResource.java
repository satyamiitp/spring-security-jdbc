package com.satyam.security.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
	@GetMapping("/")
	public String home()
	{
		return "Welcome to Home Satyam";
	}
	
	
	@GetMapping("/user")
	public String user()
	{
		return "Welcome  User";
	}
	
	
	@GetMapping("/admin")
	public String admin()
	{
		return "Welcome admin";
	}

}
