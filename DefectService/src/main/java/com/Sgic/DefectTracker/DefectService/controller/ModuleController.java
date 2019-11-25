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
import com.Sgic.DefectTracker.DefectService.entities.Module;
import com.Sgic.DefectTracker.DefectService.services.ModuleServices;

@RestController
@RequestMapping("/api/v1")
public class ModuleController {

	@Autowired
	private ModuleServices moduleServices;

	@PostMapping("/module")
	public ResponseEntity<?> createNote(@RequestBody Module module) {
		moduleServices.saveModule(module);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

	@GetMapping("/module")
	public List<Module> getModule() {
		return moduleServices.getAllModule();

	}

	@GetMapping("/module/{id}")
	public ResponseEntity<Module> getModuleById(@PathVariable(value = "id") Long id)
			throws ResourceNotFoundException {
		Module module = moduleServices.findByID(id)
				.orElseThrow(() -> new ResourceNotFoundException("Module not found for this id :: " + id));
		return ResponseEntity.ok().body(module);
	}

	@PutMapping("/module/{id}")
	public ResponseEntity<Object> updateModule(@RequestBody Module module, @PathVariable long id) {

		Optional<Module> moduleOptional = moduleServices.findByID(id);

		if (!moduleOptional.isPresent())
			return ResponseEntity.notFound().build();

		module.setModule_id(id);

		moduleServices.saveModule(module);

		return ResponseEntity.noContent().build();
	}

	@DeleteMapping("/module/{id}")
	public void deleteModule(@PathVariable long id) {
		moduleServices.deleteModule(id);
	}

}