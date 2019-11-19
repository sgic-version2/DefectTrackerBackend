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

import com.Sgic.DefectTracker.DefectService.entities.DefectType;
import com.Sgic.DefectTracker.DefectService.entities.Severity;
import com.Sgic.DefectTracker.DefectService.services.DefectTypeService;
import com.Sgic.DefectTracker.DefectService.services.SeverityService;




@RestController

@RequestMapping("/api/v1")
public class DefectTypeController {

	@Autowired
	DefectTypeService defectTypeService;
	
	
	@PostMapping(value = "/defectType")
	public ResponseEntity<?> createDefectType(@RequestBody DefectType defectType) {
		defectTypeService.createDefectType(defectType);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	
	@GetMapping("/defectType")
	  public List<DefectType> getDefectType() {
		return defectTypeService.getDefectType();

	}
	

	@DeleteMapping("/defectType/{id}")
    public ResponseEntity<?> deleteDefectType(@PathVariable Long id) { 
		defectTypeService.deleteDefectType(id);
		return ResponseEntity.ok().build();
    }
	
	
	@GetMapping("/getdefectTypeById/{defectTypeId}")
	public Optional<DefectType> getDefectType(@PathVariable(name = "DefectTypeId") Long id){
	
//		return new ResponseEntity<Severity>(HttpStatus.OK);
		
		 return defectTypeService.getDefectTypeById(id);
	}
//	@GetMapping("/getseverityByname/{serverityName}")
//	public ResponseEntity<List<Severity>> getSeverityByName(@PathVariable(name = "serverityName") String name){
//	
////		return new ResponseEntity<Severity>(HttpStatus.OK);
//		
//		 return severityRepository.findByName(name);
//	}
	
	@PutMapping("/updatedefectType/{id}")
	public ResponseEntity<Object> editDefectType(@RequestBody DefectType defectType, @PathVariable ("id") long id) {

		Optional<DefectType>DefectTypeOptional = defectTypeService.getDefectTypeById(id);

		if (!DefectTypeOptional.isPresent())
			return ResponseEntity.notFound().build();

		defectType.setTypeId(id);
	

		defectTypeService.createDefectType(defectType);

		return ResponseEntity.noContent().build();
	}
	
}
