package com.vyku.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vyku.model.Patient;

@Repository("pdao")
public class PatientDAOImpl implements IPatientDAO
{
	private static final String GET_PATIENT_DETAILS_BY_AREA="SELECT * FROM PATIENT WHERE PAREA IN (?,?,?)";
	@Autowired
	private DataSource ds;

	@Override
	public List<Patient> showpatient(String area1, String area2, String area3) throws Exception {
		List<Patient> list=null;
		
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(GET_PATIENT_DETAILS_BY_AREA))
		{
			ps.setString(1, area1);
			ps.setString(2, area2);
			ps.setString(3, area3);
			try(ResultSet rs=ps.executeQuery())
			{
				list=new ArrayList<Patient>();
			while(rs.next()) 
			{
				Patient patient=new Patient();
				patient.setPno(rs.getInt(1));
				patient.setPname(rs.getString(2));
				patient.setRdate(rs.getString(3));
				patient.setParea(rs.getString(4));
				patient.setPdisease(rs.getString(5));
				list.add(patient);
			}
			
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return list;
	}
	

}
