package com.vyku.service;

import java.util.List;

import com.vyku.model.Patient;

public interface IPatientSerivice 
{
	public List<Patient> fullShowPatient(String area1,String area2,String area) throws Exception;

}
