package com.Sgic.DefectTracker.DefectService.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Sgic.DefectTracker.DefectService.dto.ModuleCreateDTO;
import com.Sgic.DefectTracker.DefectService.dto.ModuleUpdateDTO;
import com.Sgic.DefectTracker.DefectService.services.ModuleServices;

@RestController
public class ModuleController {

	@Autowired
	private ModuleServices moduleServices;

	@GetMapping("project/{projectId}/module/{moduleId}")
	public ResponseEntity<Object> getAllModulesById(@PathVariable("projectId") Long projectId,
			@PathVariable("moduleId") Long moduleId) {
		return new ResponseEntity<Object>(moduleServices.getModulesById(projectId, moduleId), HttpStatus.OK);
	}

	@GetMapping("/project/{projectId}/module")
	public ResponseEntity<Object> getAllModulesFromProject(@PathVariable("projectId") Long projectId) {
		return new ResponseEntity<Object>(moduleServices.getAllProjects(projectId), HttpStatus.OK);
	}

	@PostMapping("/project/{projectId}/module")
	public ResponseEntity<Object> createModuleToProject(@PathVariable("projectId") Long projectId,
			@Valid @RequestBody ModuleCreateDTO moduleCreateDTO) {
		return new ResponseEntity<Object>(moduleServices.createModule(projectId, moduleCreateDTO), HttpStatus.OK);
	}

	@PutMapping("/project/{projectId}/module/{moduleId}")
	public ResponseEntity<Object> updateModule(@PathVariable("projectId") Long projectId,
			@PathVariable("moduleId") Long moduleId, ModuleUpdateDTO moduleUpdateDTO) {
		return new ResponseEntity<Object>(moduleServices.updateModule(projectId, moduleId, moduleUpdateDTO),
				HttpStatus.OK);
	}

	@DeleteMapping("/project/{projectId}/module/{moduleId}")
	public void deleteModule(@PathVariable("projectId") Long projectId, @PathVariable("moduleId") Long moduleId) {
		moduleServices.deleteProject(projectId, moduleId);
	}
}