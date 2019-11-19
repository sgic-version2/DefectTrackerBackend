package com.Sgic.DefectTracker.EmployeeService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.Sgic.DefectTracker.EmployeeService.entities.EmployeeEntity;
import com.Sgic.DefectTracker.EmployeeService.repositories.EmployeeRepository;
import com.Sgic.DefectTracker.EmployeeService.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepostories;
	

	public EmployeeEntity createNote(@RequestBody EmployeeEntity employeeEntity)
	{
		return  employeeRepostories.save(employeeEntity);
		
		
	}
	

	public List<EmployeeEntity>getEmployee()
	{
		return employeeRepostories.findAll();
	}
	
	

    public  void deleteemployee(@PathVariable Long id) {
    	employeeRepostories.deleteById(id);

    }
	

	
	public  Optional<EmployeeEntity> getEmployeeById(@PathVariable("id") Long id){
	return(employeeRepostories.findById(id));
	}
	
	
//	public  EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity, @PathVariable long id) {
//
//	Optional<EmployeeEntity> projectOptional = employeeRepostories.findById(id);
//
//	if (!projectOptional.isPresent())
//		
//	return employeeEntity.setEmployeeId(id);
//
//	return employeeRepostories.save(employeeEntity);
//
//	 
//	}
	

}
