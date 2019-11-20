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
import com.Sgic.DefectTracker.DefectService.dto.PriorityDto;
import com.Sgic.DefectTracker.DefectService.dto.mapper.Mapper;
import com.Sgic.DefectTracker.DefectService.entities.Priority;
import com.Sgic.DefectTracker.DefectService.services.PriorityService;

@RestController

@RequestMapping("/api/v1")
public class PriorityController {
	@Autowired
	PriorityService priorityService;
	@Autowired
	Mapper mapper;

	@PostMapping(value = "/priority")
	public ResponseEntity<Object> createPriority(@RequestBody PriorityDto priorityDto) {
//		if (employeeService.isEmailAlreadyExist(employeeData.getEmail())) {
//		      logger.debug("Email already exists: createEmployee(), email: {}");
//		      return new ResponseEntity<>(new BasicResponse<>(
//		          new ValidationFailure(Constants.EMAIL, errorMessages.getEmailAlreadyExist()),
//		          RestApiResponseStatus.VALIDATION_FAILURE,ValidationMessages.EMAIL_EXIST), HttpStatus.BAD_REQUEST);
//		}
		Priority priority = mapper.map(priorityDto, Priority.class);
		priorityService.createPriority(priority);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@GetMapping("/priority")
	public ResponseEntity<List<Priority>> getPriority() {
		return new ResponseEntity<List<Priority>>(priorityService.getPriority(), HttpStatus.OK);
	}

	@GetMapping("/priority/{id}")
	public ResponseEntity<Priority> getPriorityById(@PathVariable(value = "id") Long id)
			throws ResourceNotFoundException {
		Priority priority = priorityService.getPriorityById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Priority not found for this id :: " + id));
		return ResponseEntity.ok().body(priority);
	}

	@PutMapping("/updatepriority/{id}")
	public ResponseEntity<Object> editpriority(@RequestBody Priority priority, @PathVariable("id") Long id) {

		Optional<Priority> PriorityOptional = priorityService.getPriorityById(id);

		if (!PriorityOptional.isPresent())
			return new ResponseEntity<>("Severity not found for this id", HttpStatus.NOT_FOUND);

		priority.setPriorityId(id);

		priorityService.createPriority(priority);

		return new ResponseEntity<>("Priority successfully updated", HttpStatus.OK);
	}

	@DeleteMapping("/priority/{id}")
	public ResponseEntity<?> deletePriority(@PathVariable Long id) {
		priorityService.deletePriority(id);
		return new ResponseEntity<String>("Priority successfully deleted", HttpStatus.OK);
	}
}
