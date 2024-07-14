package com.vyku.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.vyku.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>,PagingAndSortingRepository<Employee, Integer> {

}
