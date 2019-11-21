package com.Sgic.DefectTracker.EmployeeService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.Sgic.DefectTracker.EmployeeService.entities.EmployeeEntity;

//import com.Sgic.DefectTracker.EmployeeService.entities.EmployeeEntity;

public interface EmployeeService {

	
	//method for save employee
	EmployeeEntity createNote(@RequestBody EmployeeEntity employeeEntity);
	//method for  get employee List
	List<EmployeeEntity>getEmployee();
	//method for Delete one employee record by Id
	 void deleteemployee(@PathVariable Long id);
	//method for getting one employee record by Id
	 Optional<EmployeeEntity> getEmployeeById(@PathVariable("id") Long id);
	
}
