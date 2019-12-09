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

import com.Sgic.DefectTracker.DefectService.dto.SubModuleCreateDTO;
import com.Sgic.DefectTracker.DefectService.dto.SubModuleUpdateDTO;
import com.Sgic.DefectTracker.DefectService.services.SubModuleService;

@RestController
public class SubModuleController {

	@Autowired
	private SubModuleService subModuleService;

	@GetMapping("/module/{moduleId}/subModule")
	public ResponseEntity<Object> getAllSubModulesFromModule(@PathVariable("moduleId") Long moduleId) {
		return new ResponseEntity<Object>(subModuleService.getAllModules(moduleId), HttpStatus.OK);
	}

	@GetMapping("/module/{moduleId}/subModule/{subModuleId}")
	public ResponseEntity<Object> getSubModuleById(@PathVariable("moduleId") Long moduleId,
			@PathVariable("subModuleId") Long submoduleId) {
		return new ResponseEntity<Object>(subModuleService.getSubModulesById(moduleId, submoduleId), HttpStatus.OK);
	}

	@PostMapping("/moduleId/{moduleId}/submodule")
	public ResponseEntity<Object> createSubModuleToModule(@PathVariable("moduleId") Long moduleId,
			SubModuleCreateDTO submoduleCretaeDTO) {
		return new ResponseEntity<Object>(subModuleService.createSubModule(moduleId, submoduleCretaeDTO),
				HttpStatus.OK);
	}

	@PutMapping("/module/{moduleId}/subModule/{subModuleId}")
	public ResponseEntity<Object> updateSubModule(@PathVariable("moduleId") Long moduleId,
			@PathVariable("subModuleId") Long subModuleId, SubModuleUpdateDTO subModuleUpdateDTO) {
		return new ResponseEntity<Object>(subModuleService.updateSubModule(moduleId, subModuleId, subModuleUpdateDTO),
				HttpStatus.OK);

	}

	@DeleteMapping("/module/{moduleId}/subModule/{subModuleId}")
	public void deleteSubModules(@PathVariable("moduleId") Long moduleId,
			@PathVariable("subModuleId") Long subModuleId) {
		subModuleService.deleteSubModule(moduleId, subModuleId);
	}
}
