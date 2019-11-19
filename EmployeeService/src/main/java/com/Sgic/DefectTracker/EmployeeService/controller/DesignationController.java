package com.Sgic.DefectTracker.EmployeeService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Sgic.DefectTracker.EmployeeService.entities.Designation;
import com.Sgic.DefectTracker.EmployeeService.service.DesignationService;

@RestController
public class DesignationController {
	
	@Autowired
	private DesignationService designationService;
	
	
	@PostMapping("/designation")
	public ResponseEntity<?> createNote(@RequestBody Designation designation)
	{
		designationService.createDesignation(designation);
		
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	
	
	
	
	
	
	

}
