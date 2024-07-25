package com.vyku.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vyku.service.ISeasonFinderMgmtService;

@Controller
public class SeasonController {
    
    @Autowired
    private ISeasonFinderMgmtService sfService;
    
    @RequestMapping("/")
    public String welcomeScreen(Map<String,Object> map) 
    {
	return "welcome";
    }
    @RequestMapping("/season")
    public String showSeason(Map<String,Object> map) 
    {
	map.put("Attr1", "Current Season is");
	map.put("Attr2", sfService.seasonGuessing());
	
	return "showSeason";
    }
    
    
    
	
	

}
