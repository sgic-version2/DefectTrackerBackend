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
import com.Sgic.DefectTracker.DefectService.dto.DefectStatusDto;
import com.Sgic.DefectTracker.DefectService.dto.mapper.Mapper;
import com.Sgic.DefectTracker.DefectService.entities.DefectStatus;
import com.Sgic.DefectTracker.DefectService.services.DefectStatusService;

@RestController

@RequestMapping("/api/v1")
public class DefectStatusController {

	@Autowired
	DefectStatusService defectStatusService;
	@Autowired
	Mapper mapper;

//	@PostMapping(value = "/defectStatus")
//	public ResponseEntity<?> createDefectStatus(@RequestBody DefectStatus defectStatus) {
//		defectStatusService.createDefectStatus(defectStatus);
//		return new ResponseEntity<Object>(HttpStatus.OK);
//	}
	@PostMapping(value = "/defectStatus")
	public ResponseEntity<Object> createDefectStatus(@RequestBody DefectStatusDto defectStatusDto) {
//		if (employeeService.isEmailAlreadyExist(employeeData.getEmail())) {
//		      logger.debug("Email already exists: createEmployee(), email: {}");
//		      return new ResponseEntity<>(new BasicResponse<>(
//		          new ValidationFailure(Constants.EMAIL, errorMessages.getEmailAlreadyExist()),
//		          RestApiResponseStatus.VALIDATION_FAILURE,ValidationMessages.EMAIL_EXIST), HttpStatus.BAD_REQUEST);
//		}
		DefectStatus defectStatus = mapper.map(defectStatusDto, DefectStatus.class);
		defectStatusService.createDefectStatus(defectStatus);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@GetMapping("/defectStatus")
	public ResponseEntity<List<DefectStatus>> getDefectStatus() {
		return new ResponseEntity<List<DefectStatus>>(defectStatusService.getDefectStatus(), HttpStatus.OK);
	}

//	@GetMapping("/getdefectStatusById/{defectStatusId}")
//	public Optional<DefectStatus> getDefectStatus(@PathVariable(name = "DefectStatusId") Long id) {
//
//		return defectStatusService.getDefectStatusById(id);
//	}

	@GetMapping("/getdefectStatusById/{id}")
	public ResponseEntity<DefectStatus> getDefectStatus(@PathVariable(value = "id") Long id)
			throws ResourceNotFoundException {
		DefectStatus defectStatus = defectStatusService.getDefectStatusById(id)
				.orElseThrow(() -> new ResourceNotFoundException("DefectStatus not found for this id :: " + id));
		return ResponseEntity.ok().body(defectStatus);
	}

	@PutMapping("/updatedefectStatus/{id}")
	public ResponseEntity<Object> editDefectStatus(@RequestBody DefectStatus defectStatus,
			@PathVariable("id") long id) {

		Optional<DefectStatus> DefectStatusOptional = defectStatusService.getDefectStatusById(id);

		if (!DefectStatusOptional.isPresent())
			return new ResponseEntity<>("Severity not found for this id", HttpStatus.NOT_FOUND);
		defectStatus.setStatusId(id);

		defectStatusService.createDefectStatus(defectStatus);

		return new ResponseEntity<>("Severity successfully updated", HttpStatus.OK);
	}

	@DeleteMapping("/defectStatus/{id}")
	public ResponseEntity<?> deleteDefectStatus(@PathVariable Long id) {
		defectStatusService.deleteDefectStatus(id);
		return new ResponseEntity<String>("Priority successfully deleted", HttpStatus.OK);
	}
}