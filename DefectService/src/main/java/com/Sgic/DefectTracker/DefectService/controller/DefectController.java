package com.Sgic.DefectTracker.DefectService.controller;

import java.util.List;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sgic.DefectTracker.DefectService.Exception.ResourceNotFoundException;
import com.Sgic.DefectTracker.DefectService.entities.Defect;
import com.Sgic.DefectTracker.DefectService.services.DefectService;

@RestController
public class DefectController {

	@Autowired
	DefectService defectService;

	@PostMapping("project/{projectId}/defect")
	public ResponseEntity<?> addDefectToProject(@PathVariable("projectId") Long projectId,
			@Valid @RequestBody Defect defect) {
		defectService.addDefectToProject(projectId, defect);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}


	@GetMapping("/defect")
	public ResponseEntity<List<Defect>> getDefectEntity() {
		return new ResponseEntity<List<Defect>>(defectService.getDefectEntity(), HttpStatus.OK);
	}

	@GetMapping("/getdefectById/{id}")
	public ResponseEntity<Defect> getDefectEntityById(@PathVariable(value = "id") Long id)
			throws ResourceNotFoundException {
		Defect defectEntity = defectService.getDefectEntityById(id)
				.orElseThrow(() -> new ResourceNotFoundException("DefectEntity not found for this id :: " + id));
		return ResponseEntity.ok().body(defectEntity);
	}

	@DeleteMapping("/defect/{id}")
	public ResponseEntity<?> deleteDefectEntity(@PathVariable Long id) {
		defectService.deleteDefectEntity(id);
		return new ResponseEntity<String>("DefectEntity successfully deleted", HttpStatus.OK);
	}

	@PutMapping("/updatedefect/{id}")
	public ResponseEntity<Object> editDefectEntity(@RequestBody Defect defectEntity, @PathVariable("id") Long id) {

		Optional<Defect> DefectEntityOptional = defectService.getDefectEntityById(id);

		if (!DefectEntityOptional.isPresent())
			return new ResponseEntity<>("DefectEntity not found for this id", HttpStatus.NOT_FOUND);

		defectEntity.setDefectId(id);

		defectService.createDefectEntity(defectEntity);

		return new ResponseEntity<>("Severity successfully updated", HttpStatus.OK);
	}
}
