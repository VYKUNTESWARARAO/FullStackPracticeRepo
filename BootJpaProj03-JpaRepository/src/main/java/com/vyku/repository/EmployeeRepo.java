package com.vyku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vyku.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
