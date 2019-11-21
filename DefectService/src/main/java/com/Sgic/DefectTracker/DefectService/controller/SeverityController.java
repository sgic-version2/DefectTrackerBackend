package com.Sgic.DefectTracker.DefectService.controller;





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

import com.Sgic.DefectTracker.DefectService.dto.Severitydto;
import com.Sgic.DefectTracker.DefectService.dto.mapper.Mapper;
import com.Sgic.DefectTracker.DefectService.entities.Severity;

import com.Sgic.DefectTracker.DefectService.services.SeverityService;




@RestController

@RequestMapping("/api/v1")
public class SeverityController {

	@Autowired
	SeverityService severityService;
	@Autowired
	Mapper mapper;
	
//	@PostMapping(value = "/severity")
//	public ResponseEntity<?> createSeverity(@RequestBody Severity severity) {
//		severityService.createSeverity(severity);
//		return new ResponseEntity<Object>(HttpStatus.OK);
//	}
	@PostMapping(value = "/severity")
	public ResponseEntity<Object> createSeverity(@RequestBody Severitydto severitydto) {
//		if (employeeService.isEmailAlreadyExist(employeeData.getEmail())) {
//		      logger.debug("Email already exists: createEmployee(), email: {}");
//		      return new ResponseEntity<>(new BasicResponse<>(
//		          new ValidationFailure(Constants.EMAIL, errorMessages.getEmailAlreadyExist()),
//		          RestApiResponseStatus.VALIDATION_FAILURE,ValidationMessages.EMAIL_EXIST), HttpStatus.BAD_REQUEST);
//		}
		Severity severity = mapper.map(severitydto, Severity.class);
		severityService.createSeverity(severity);
		return new ResponseEntity<>( HttpStatus.OK);
		
	}
	
	
	@GetMapping("/severity")
	  public List<Severity> getSeverity() {
		return severityService.getSeverity();

	}
	

	@DeleteMapping("/severity/{id}")
    public ResponseEntity<?> deleteSeverity(@PathVariable Long id) { 
		severityService.deleteSeverity(id);
		return ResponseEntity.ok().build();
    }
	
	
	@GetMapping("/getseverityById/{serverityId}")
	public Optional<Severity> getSeverityById(@PathVariable(name = "serverityId") Long id){
	
//		return new ResponseEntity<Severity>(HttpStatus.OK);
		
		 return severityService.getSeverityById(id);
	}
//	@GetMapping("/getseverityByname/{serverityName}")
//	public ResponseEntity<List<Severity>> getSeverityByName(@PathVariable(name = "serverityName") String name){
//	
////		return new ResponseEntity<Severity>(HttpStatus.OK);
//		
//		 return severityRepository.findByName(name);
//	}
	
	@PutMapping("/updateseverity/{id}")
	public ResponseEntity<Object> editSeverity(@RequestBody Severity severity, @PathVariable ("id") long id) {

		Optional<Severity>SeverityOptional = severityService.getSeverityById(id);

		if (!SeverityOptional.isPresent())
			return ResponseEntity.notFound().build();

		severity.setServerityId(id);

		severityService.createSeverity(severity);

		return ResponseEntity.noContent().build();
	}
	
}