package com.vyku.repository;

import org.springframework.data.repository.CrudRepository;

import com.vyku.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
