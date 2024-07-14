package com.vyku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vyku.dao.IPatientDAO;
import com.vyku.model.Patient;

@Service("pservice")
public class PatientServiceImpl implements IPatientSerivice {

	@Autowired
	private IPatientDAO patientDAO;
	@Override
	public List<Patient> fullShowPatient(String area1, String area2, String area3) throws Exception 
	{
		List<Patient> list=patientDAO.showpatient(area1, area2, area3);
		
		return list;
	}

}
