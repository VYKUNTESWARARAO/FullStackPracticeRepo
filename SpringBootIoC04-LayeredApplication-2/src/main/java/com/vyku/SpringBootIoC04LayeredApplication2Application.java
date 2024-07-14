package com.vyku;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.vyku.controller.PatientController;
import com.vyku.model.Patient;

@SpringBootApplication
public class SpringBootIoC04LayeredApplication2Application {

	public static void main(String[] args) throws Exception 
	{
		
		ApplicationContext ctx =SpringApplication.run(SpringBootIoC04LayeredApplication2Application.class, args);
		PatientController pcontroller=ctx.getBean("pController",PatientController.class);
		try 
		{
			List<Patient> result=pcontroller.megaFullShowPatient("Telangana", "Delhi", "Chennai");
			result.forEach(patient->System.out.println(patient));
		}catch (Exception e) {
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
	}

}
