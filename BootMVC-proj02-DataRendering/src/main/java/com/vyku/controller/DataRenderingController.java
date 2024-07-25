package com.vyku.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataRenderingController {
	
	@RequestMapping("/process")
	public String showprocess(Map<String,Object> map) 
	{
		map.put("Attr1", "Welcome Chinni");
		map.put("Attr2","Enjoy pandagooo");
		return "process";
	}

}
