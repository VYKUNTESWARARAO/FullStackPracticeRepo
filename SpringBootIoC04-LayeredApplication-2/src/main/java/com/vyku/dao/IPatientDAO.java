package com.vyku.dao;

import java.util.List;

import com.vyku.model.Patient;

public interface IPatientDAO 
{
	public List<Patient> showpatient(String area1,String area2,String area3) throws Exception;
}
