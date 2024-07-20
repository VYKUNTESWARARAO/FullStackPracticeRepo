package com.vyku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {
	
	@RequestMapping("/")
	public String showWelcomePage() 
	{
		return "Welcome";
	}
	@RequestMapping("/home")
	public String showHomePage() 
	{
		return "Home";
	}

}
