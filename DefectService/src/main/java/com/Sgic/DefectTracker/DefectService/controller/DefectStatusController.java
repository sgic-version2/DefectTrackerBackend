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

import com.Sgic.DefectTracker.DefectService.entities.DefectStatus;
import com.Sgic.DefectTracker.DefectService.services.DefectStatusService;


@RestController

@RequestMapping("/api/v1")
public class DefectStatusController {

	@Autowired
DefectStatusService defectStatusService;
	
	
	@PostMapping(value = "/defectStatus")
	public ResponseEntity<?> createDefectStatus(@RequestBody DefectStatus defectStatus) {
		defectStatusService.createDefectStatus(defectStatus);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	
	@GetMapping("/defectStatus")
	  public List<DefectStatus> getDefectStatus() {
		return defectStatusService.getDefectStatus();

	}
	

	@DeleteMapping("/defectStatus/{id}")
    public ResponseEntity<?> deleteDefectStatus(@PathVariable Long id) { 
		defectStatusService.deleteDefectStatus(id);
		return ResponseEntity.ok().build();
    }
	
	
	@GetMapping("/getdefectStatusById/{defectStatusId}")
	public Optional<DefectStatus> getDefectStatus(@PathVariable(name = "DefectStatusId") Long id){
	
//		return new ResponseEntity<Severity>(HttpStatus.OK);
		
		 return defectStatusService.getDefectStatusById(id);
	}
//	@GetMapping("/getseverityByname/{serverityName}")
//	public ResponseEntity<List<Severity>> getSeverityByName(@PathVariable(name = "serverityName") String name){
//	
////		return new ResponseEntity<Severity>(HttpStatus.OK);
//		
//		 return severityRepository.findByName(name);
//	}
	
	@PutMapping("/updatedefectStatus/{id}")
	public ResponseEntity<Object> editDefectStatus(@RequestBody DefectStatus defectStatus, @PathVariable ("id") long id) {

		Optional<DefectStatus>DefectStatusOptional = defectStatusService.getDefectStatusById(id);

		if (!DefectStatusOptional.isPresent())
			return ResponseEntity.notFound().build();

		defectStatus.setStatusId(id);
	

		defectStatusService.createDefectStatus(defectStatus);

		return ResponseEntity.noContent().build();
	}
}