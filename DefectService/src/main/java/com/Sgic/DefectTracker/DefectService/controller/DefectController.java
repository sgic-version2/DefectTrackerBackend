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

import com.Sgic.DefectTracker.DefectService.Exception.ResourceNotFoundException;
import com.Sgic.DefectTracker.DefectService.dto.DefectCreateDTO;
import com.Sgic.DefectTracker.DefectService.dto.DefectUpdateDTO;
import com.Sgic.DefectTracker.DefectService.entities.Defect;
import com.Sgic.DefectTracker.DefectService.services.DefectService;

@RestController
public class DefectController {

	@Autowired
	DefectService defectService;

	@GetMapping("/getdefectById/{id}")
	public ResponseEntity<Defect> getDefectEntityById(@PathVariable(value = "id") Long id)
			throws ResourceNotFoundException {
		Defect defectEntity = defectService.getDefectEntityById(id)
				.orElseThrow(() -> new ResourceNotFoundException("DefectEntity not found for this id :: " + id));
		return ResponseEntity.ok().body(defectEntity);
	}

	@PostMapping("/project/{projectId}/defect")
	public ResponseEntity<Object> createDefectToProject(@PathVariable("projectId") Long projectId, Long moduleId,
			Long severityId, Long priorityId, Long defectStatusId, Long defectTypeId, DefectCreateDTO defectCreateDTO) {
		return new ResponseEntity<Object>(defectService.createDefect(projectId, defectCreateDTO), HttpStatus.OK);
	}

	@GetMapping("/project/{projectId}/defect")
	public ResponseEntity<Object> getAllDefectsFromProject(@PathVariable("projectId") Long projectId) {
		return new ResponseEntity<Object>(defectService.getAllDefects(projectId), HttpStatus.OK);
	}

	@GetMapping("/project/{projectId}/defect/{defectId}")
	public ResponseEntity<Object> getDefectsById(@PathVariable("projectId") Long projectId,
			@PathVariable("defectId") Long defectId) {
		return new ResponseEntity<Object>(defectService.getDefectsById(projectId, defectId), HttpStatus.OK);
	}

	@PutMapping("/projectId/{projectId}/defect/{defectId}")
	public ResponseEntity<Object> updateDefect(@PathVariable("projectId") Long projectId,
			@PathVariable("defectId") Long defectId, DefectUpdateDTO defectUpdateDTO) {
		return new ResponseEntity<Object>(defectService.updateDefect(projectId, defectId, defectUpdateDTO),
				HttpStatus.OK);
	}

	@DeleteMapping("/projectId/{projectId}/defect/{defectId}")
	public void deleteDefect(@PathVariable("projectId") Long projectId, @PathVariable("defectId") Long defectId) {
		defectService.deleteDefect(projectId, defectId);
	}
}
