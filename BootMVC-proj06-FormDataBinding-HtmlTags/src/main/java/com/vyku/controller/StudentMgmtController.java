package com.vyku.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vyku.model.Student;

@Controller
public class StudentMgmtController {
    
    @GetMapping("/")
    public String showHomepage() 
    {
	return "home";
    }
    @GetMapping("/register")
    public String showRegisterForm() 
    {
	return "register_form";
	
    }
    @PostMapping("/register")
    public String showStudentData(Map<String,Object> map,@ModelAttribute("stud") Student stu) 
    {
	
	System.out.println(stu);
	return "show_result";
    }


}
