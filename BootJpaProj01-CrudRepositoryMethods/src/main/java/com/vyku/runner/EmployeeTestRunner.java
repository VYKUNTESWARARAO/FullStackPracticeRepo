package com.vyku.runner;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vyku.entity.Employee;
import com.vyku.service.IEmployeeService;

@Component
public class EmployeeTestRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeService empService;
	 
	@Override
	public void run(String... args) throws Exception {
//		Employee emp=new Employee("Rajesh", 99999999L, "Clerk", "Garividi ",20000.0);
//		String msg=empService.addEmployee(emp);
//		System.out.println(msg);
		Employee emp1=new Employee("Ramesh", 88888888L, "Manager", "Vizianagaram",80000.0);
		Employee emp2=new Employee("Govind", 97777779L, "Associate", "Banglore ",50000.0);
		Employee emp3=new Employee("Appalanaidu", 966666679L, "Clerk", "Waranagl",20000.0);
		Employee emp4=new Employee("Nagendra", 9244646369L, "Manager", "Vishakapatnam",90000.0);
		Employee emp5=new Employee("Vyku", 466661666L, "CEO", "Banglore ",100000.0);
		Employee emp6=new Employee("chinna", 5555955555L, "Manager", "Srikakulam ",20000.0);
		Employee emp7=new Employee("Rakesh", 64643166L, "Clerk", "Bihar",15000.0);
		
		List<Employee> list=List.of(emp1,emp2,emp3,emp4,emp5,emp6,emp7);
		
		try {
			String msg=empService.registerAllEmployees(list);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
//		try {
//			Employee emp=empService.getEmployeeById(1196);
//			System.out.println(emp);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			Optional<Employee> opt=empService.showEmployeeByID(1096);
//			if(opt.isPresent()) 
//			{
//				System.out.println(":::::::::::>>>>>>> "+opt.get());
//			}
//			else 
//			{
//				System.out.println(":::::::::::>>>>>>> Employee Not Found With this Id");
//			}
//					
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			
//		}
		
//		try {
//		List<Integer> list=List.of(1001,1192,1193,1194);
//		empService.getEmployeesByMoreIds(list).forEach(System.out::println);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		try {
//		empService.getAllEmployees().forEach(System.out::println);
//			}
//			catch (Exception e) {
//				e.printStackTrace();
//			}
//		
//		Long count= empService.getCountOfEmployees();
//		System.out.println(count+" Employees are there in table");
//		if(empService.checkEmployeeByID(1192)) 
//		{
//			System.out.println("Employee Found");
//		}
//		else 
//		{
//			System.out.println(" Employee not Found with this Id");
//		}
//		try {
//			Employee emp=new Employee(1001, "NNNN", 9199292L, "xxx", "xxx", 0.0);
//			String msg=empService.removeEmployee(emp);
//			System.out.println(msg);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		try 
//		{
//			String msg=empService.kickEmployeeById(1192);
//			System.out.println(msg);
//		}
//		catch(Exception e) 
//		{
//			e.printStackTrace();
//		}
//		
//		Employee emp1=new Employee(1193, "ddd",222L, "ssss", "ssdd", 2.2);
//		Employee emp2=new Employee(1194, "ddd",222L, "ssss", "ssdd", 2.2);
//		List<Employee> list=List.of(emp1,emp2);
//		try 
//		{
//			String msg=empService.deleteEmployeeByObjects(list);
//			System.out.println(msg);
//			
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
//		try 
//		{
//			String msg=empService.deleteAllEmployees();
//			System.out.println(msg);
//					
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		
		
		
	}

}
