package com.Sgic.DefectTracker.DefectService.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Sgic.DefectTracker.DefectService.entities.SubModule;
import com.Sgic.DefectTracker.DefectService.services.SubModuleService;

@Repository
@RequestMapping("/ap/v1")
public class SubModuleController {

	@Autowired
	private SubModuleService subModuleService;

	@PostMapping("/submodule")
	public ResponseEntity<?> createNote(@RequestBody SubModule subModule) {
		subModuleService.saveSubModule(subModule);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

	@GetMapping("/submodule")
	public List<SubModule> getSubModule() {
		return subModuleService.getAllSubModule();

	}

	@PutMapping("/submodule/{id}")
	public ResponseEntity<Object> updateSubModule(@RequestBody SubModule subModule, @PathVariable long id) {

		Optional<SubModule> subModuleOptional = subModuleService.findByID(id);

		if (!subModuleOptional.isPresent())
			return ResponseEntity.notFound().build();

		subModule.setSubmodule_id(id);

		subModuleService.saveSubModule(subModule);

		return ResponseEntity.noContent().build();
	}

	@DeleteMapping("/submodule/{id}")
	public void deleteSubModule(@PathVariable long id) {
		subModuleService.deleteSubModule(id);
	}
}
