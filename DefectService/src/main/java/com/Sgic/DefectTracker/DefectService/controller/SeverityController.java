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

import com.Sgic.DefectTracker.DefectService.Exception.ResourceNotFoundException;
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
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@GetMapping("/severity")
	public ResponseEntity<List<Severity>> getSeverity() {
		return new ResponseEntity<List<Severity>>(severityService.getSeverity(), HttpStatus.OK);
	}



	@GetMapping("/getseverityById/{id}")
	public ResponseEntity<Severity> getSeverityById(@PathVariable(value = "id") Long id)
			throws ResourceNotFoundException {
		Severity severity = severityService.getSeverityById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Severity not found for this id :: " + id));
		return ResponseEntity.ok().body(severity);
	}






	@DeleteMapping("/severity/{id}")
	public ResponseEntity<?> deleteSeverity(@PathVariable Long id) {
		severityService.deleteSeverity(id);
		return new ResponseEntity<String>("severity successfully deleted", HttpStatus.OK);
	}
	@PutMapping("/updateseverity/{id}")
	public ResponseEntity<Object> editSeverity(@RequestBody Severity severity, @PathVariable("id") Long id) {

		Optional<Severity> SeverityOptional = severityService.getSeverityById(id);

		if (!SeverityOptional.isPresent())
			return new ResponseEntity<>("Severity not found for this id", HttpStatus.NOT_FOUND);

		severity.setServerityId(id);

		severityService.createSeverity(severity);

		return new ResponseEntity<>("Severity successfully updated", HttpStatus.OK);
	}
	
	
//	@PostMapping(value = "/severity")
//	public ResponseEntity<?> createSeverity(@RequestBody Severity severity) {
//		severityService.createSeverity(severity);
//		return new ResponseEntity<Object>(HttpStatus.OK);
//	}
//	@GetMapping("/severity")
//	public @ResponseBody ResponseEntity<Severity> getSeverity() {
//	 severityService.getSeverity();
//	    return new ResponseEntity<Severity>("GET Response", HttpStatus.OK);
//	}

//	@GetMapping("/getseverityById/{serverityId}")
//	public Optional<Severity> getSeverityById(@PathVariable(name = "serverityId") Long id){
//	
////		return new ResponseEntity<Severity>(HttpStatus.OK);
//		
//		 return severityService.getSeverityById(id);
//	}
//	@GetMapping("/getseverityByname/{serverityName}")
//	public ResponseEntity<List<Severity>> getSeverityByName(@PathVariable(name = "serverityName") String name){
//	
////		return new ResponseEntity<Severity>(HttpStatus.OK);
//		
//		 return severityRepository.findByName(name);
//	}
//	@DeleteMapping("/severity/{id}")
//	public Map<String, Boolean> deleteSeverity(@PathVariable(value = "id") Long id)
//	  throws ResourceNotFoundException {
//		Severity severity = severityService.getSeverityById(id)
//	   .orElseThrow(() -> new ResourceNotFoundException("Severity not found for this id :: " + id));
//
//		severityService.deleteSeverity(severity);
//	 Map<String, Boolean> response = new HashMap<>();
//	 response.put("deleted", Boolean.TRUE);
//	 return response;
//	}
//	
}
