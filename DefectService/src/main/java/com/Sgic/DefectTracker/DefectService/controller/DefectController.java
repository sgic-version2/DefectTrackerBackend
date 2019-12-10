package com.Sgic.DefectTracker.DefectService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sgic.DefectTracker.DefectService.dto.DefectCreateDTO;
import com.Sgic.DefectTracker.DefectService.dto.DefectUpdateDTO;
import com.Sgic.DefectTracker.DefectService.services.DefectService;

@RestController
public class DefectController {

	@Autowired
	DefectService defectService;

	@PostMapping("/project/{projectId}/module/{moduleId}/subModule/{subModuleId}")
	public ResponseEntity<Object> createDefectToProject(@PathVariable("projectId") Long projectId,
			@PathVariable("moduleId") Long moduleId, @PathVariable("subModuleId") Long subModuleId,
			DefectCreateDTO defectCreateDTO) {
		return new ResponseEntity<Object>(defectService.createDefect(projectId, moduleId, subModuleId, defectCreateDTO),
				HttpStatus.OK);
	}

	@GetMapping("/project/{projectId}/defect")
	public ResponseEntity<Object> getAllDefectsFromProject(@PathVariable("projectId") Long projectId) {
		return new ResponseEntity<Object>(defectService.getAllDefects(projectId), HttpStatus.OK);
	}

	@GetMapping("/project/{projectId}/module/{moduleId}/subModule/{subModuleId}")
	public ResponseEntity<Object> getAllDefectsFromSubModule(@PathVariable("projectId") Long projectId,
			@PathVariable("moduleId") Long moduleId, @PathVariable("subModuleId") Long subModuleId) {
		return new ResponseEntity<Object>(defectService.getDefectFromSubModule(projectId, moduleId, subModuleId),
				HttpStatus.OK);
	}

	@GetMapping("/project/{projectId}/module/{moduleId}/subModule/{subModuleId}/defect/{defectId}")
	public ResponseEntity<Object> getDefectsById(@PathVariable("projectId") Long projectId,
			@PathVariable("moduleId") Long moduleId, @PathVariable("subModuleId") Long subModuleId,
			@PathVariable("defectId") Long defectId) {
		return new ResponseEntity<Object>(defectService.getDefectsById(projectId, moduleId, subModuleId, defectId),
				HttpStatus.OK);
	}

	@PutMapping("/project/{projectId}/module/{moduleId}/subModule/{subModuleId}/defect/{defectId}")
	public ResponseEntity<Object> updateDefect(@PathVariable("projectId") Long projectId,
			@PathVariable("moduleId") Long moduleId, @PathVariable("subModuleId") Long subModuleId,
			@PathVariable("defectId") Long defectId, DefectUpdateDTO defectUpdateDTO) {
		return new ResponseEntity<Object>(
				defectService.updateDefect(projectId, moduleId, subModuleId, defectId, defectUpdateDTO), HttpStatus.OK);
	}

	@DeleteMapping("/project/{projectId}/module/{moduleId}/subModule/{subModuleId}/defect/{defectId}")
	public void deleteDefect(@PathVariable("projectId") Long projectId, @PathVariable("moduleId") Long moduleId,
			@PathVariable("subModuleId") Long subModuleId, @PathVariable("defectId") Long defectId) {
		defectService.deleteDefect(projectId, moduleId, subModuleId, defectId);
	}
}
