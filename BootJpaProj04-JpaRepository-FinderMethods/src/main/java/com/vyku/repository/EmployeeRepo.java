package com.vyku.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vyku.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findByEmpDesignation(String designation);
	public List<Employee> findByEmpDesignationEquals(String designation);
	public List<Employee> findByEmpDesignationIs(String designation);
	public List<Employee> findByEmpDesignationStartsWith(String name);
	public List<Employee> findByEmpNameEndsWith(String name);
	public List<Employee> findByEmpNameContaining(String name);
	public List<Employee> findByEmpNameEqualsIgnoreCase(String name);
	public List<Employee> findByEmpNameLike(String name);
	
	

}
