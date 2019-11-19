package com.Sgic.DefectTracker.EmployeeService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.Sgic.DefectTracker.EmployeeService.entities.EmployeeEntity;

//import com.Sgic.DefectTracker.EmployeeService.entities.EmployeeEntity;

public interface EmployeeService {

	EmployeeEntity createNote(@RequestBody EmployeeEntity employeeEntity);
	
	List<EmployeeEntity>getEmployee();
	
	 void deleteemployee(@PathVariable Long id);
	 
	 Optional<EmployeeEntity> getEmployeeById(@PathVariable("id") Long id);
	
}
