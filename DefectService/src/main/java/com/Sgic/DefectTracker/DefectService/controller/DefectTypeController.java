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
import com.Sgic.DefectTracker.DefectService.dto.DefectTypeDto;
import com.Sgic.DefectTracker.DefectService.dto.mapper.Mapper;
import com.Sgic.DefectTracker.DefectService.entities.DefectType;
import com.Sgic.DefectTracker.DefectService.services.DefectTypeService;

@RestController

@RequestMapping("/api/v1")
public class DefectTypeController {

	@Autowired
	DefectTypeService defectTypeService;
	@Autowired
	Mapper mapper;

//	@PostMapping(value = "/defectType")
//	public ResponseEntity<?> createDefectType(@RequestBody DefectType defectType) {
//		defectTypeService.createDefectType(defectType);
//		return new ResponseEntity<Object>(HttpStatus.OK);
//	}
	@PostMapping(value = "/defectType")
	public ResponseEntity<Object> createDefectType(@RequestBody DefectTypeDto defectTypeDto) {
//		if (employeeService.isEmailAlreadyExist(employeeData.getEmail())) {
//		      logger.debug("Email already exists: createEmployee(), email: {}");
//		      return new ResponseEntity<>(new BasicResponse<>(
//		          new ValidationFailure(Constants.EMAIL, errorMessages.getEmailAlreadyExist()),
//		          RestApiResponseStatus.VALIDATION_FAILURE,ValidationMessages.EMAIL_EXIST), HttpStatus.BAD_REQUEST);
//		}
		DefectType defectType = mapper.map(defectTypeDto, DefectType.class);
		defectTypeService.createDefectType(defectType);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@GetMapping("/defectType")
	public ResponseEntity<List<DefectType>> getDefectType() {
		return new ResponseEntity<List<DefectType>>(defectTypeService.getDefectType(), HttpStatus.OK);
	}

	@GetMapping("/getdefectTypeById/{id}")
	public ResponseEntity<DefectType> getDefectType(@PathVariable(value = "id") Long id)
			throws ResourceNotFoundException {
		DefectType defectType = defectTypeService.getDefectTypeById(id)
				.orElseThrow(() -> new ResourceNotFoundException("DefectType not found for this id :: " + id));
		return ResponseEntity.ok().body(defectType);
	}

	@PutMapping("/updatedefectType/{id}")
	public ResponseEntity<Object> editDefectType(@RequestBody DefectType defectType, @PathVariable("id") Long id) {

		Optional<DefectType> DefectTypeOptional = defectTypeService.getDefectTypeById(id);

		if (!DefectTypeOptional.isPresent())
			return new ResponseEntity<>("Severity not found for this id", HttpStatus.NOT_FOUND);

		defectType.setTypeId(id);

		defectTypeService.createDefectType(defectType);

		return new ResponseEntity<>("Priority successfully updated", HttpStatus.OK);
	}

	@DeleteMapping("/defectType/{id}")
	public ResponseEntity<?> deleteDefectType(@PathVariable Long id) {
		defectTypeService.deleteDefectType(id);
		return new ResponseEntity<String>("Priority successfully deleted", HttpStatus.OK);
	}

}