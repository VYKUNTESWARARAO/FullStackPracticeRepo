package com.vyku.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.vyku.entity.Employee;



@Controller
public class TestController {
    
//    @GetMapping("/result")
//    public String showResult(Map<String,Object> map) 
//    {
//	map.put("Name","Vyku");
//	map.put("Age",30);
//	return "result";
//    }

    
//    @GetMapping("/")
//    public String showResult(Map<String,Object> map) 
//    {
//	map.put("FavColors",new String[] {"red","green","yellow"});
//	map.put("NickNames",List.of("vyku","lahari","chinni"));
//	map.put("Brands",Set.of("Puma","Nike","HRX"));
//	map.put("Games", Map.of("Chess","Magnus","Cricket","Virat"));
//	
//	
//	return "result";
//    }
    
//    @GetMapping("/emp")
//    public String showEmpData(Map<String,Object> map) 
//    {
//	Employee emp=new Employee();
//	
//	emp.setEmpName("chinni");
//	emp.setId(101);
//	emp.setEmpAddress("hyd");
//	emp.setSal(44256.0);
//	map.put("empData",emp);
//	
//	return "show_emp";
//    }
    
    @GetMapping("/emp")
    public String showEmpData(Map<String,Object> map) 
    {
	List<Employee> list=List.of(new Employee(103,"Anju","punjab",2222.0),new Employee(103,"rocky","hyd",322232.0),new Employee(102,"lahari","ninja",11422.0));
	map.put("empData", list);
	

	return "show_emp";
    }
}
