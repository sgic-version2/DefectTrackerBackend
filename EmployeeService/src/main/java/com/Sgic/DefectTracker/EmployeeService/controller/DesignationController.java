package com.Sgic.DefectTracker.EmployeeService.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sgic.DefectTracker.EmployeeService.entities.Designation;
import com.Sgic.DefectTracker.EmployeeService.service.DesignationService;

@RestController
@RequestMapping("/api/v1")
public class DesignationController {
	
	@Autowired
	private DesignationService designationService;
	
	@PostMapping(value="/designation")
	public ResponseEntity<?>createNote(@RequestBody Designation designation)
	{
	designationService.saveDesignation(designation);
	   return new ResponseEntity<Object>(HttpStatus.OK);
	}



	@GetMapping("/designation")
	public List<Designation> listDesignations()
	{
	return designationService.getAllDesignation();
	}

	@PutMapping("/designation/{id}")
	public ResponseEntity<Object> updateProject(@RequestBody Designation designation, @PathVariable long id) {

	Optional<Designation> designationOptional =designationService.findById(id);

	if (!designationOptional.isPresent())
	return ResponseEntity.notFound().build();

	designation.setDesignationId(id);

	designationService.saveDesignation(designation);

	return ResponseEntity.noContent().build();
	}
	@DeleteMapping("/designation/{id}")
	public void deleteModule(@PathVariable long id) {
	designationService.deleteDesignation(id);
	}
	}

