package com.vyku.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.vyku.model.Patient;
import com.vyku.service.IPatientSerivice;

@Controller("pController")
public class PatientController{
	@Autowired
	private IPatientSerivice pservice;
	
	public List<Patient> megaFullShowPatient(String area1,String area2,String area3) throws Exception
	{
		List<Patient> list=pservice.fullShowPatient(area1, area2, area3);
		return list;
	}
	
	

}
