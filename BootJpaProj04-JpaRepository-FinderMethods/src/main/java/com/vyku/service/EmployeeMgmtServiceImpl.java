package com.vyku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.vyku.entity.Employee;
import com.vyku.repository.EmployeeRepo;


@Service
public class EmployeeMgmtServiceImpl implements IEmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;

}
