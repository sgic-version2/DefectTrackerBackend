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

import com.Sgic.DefectTracker.DefectService.entities.Priority;

import com.Sgic.DefectTracker.DefectService.services.PriorityService;


@RestController

@RequestMapping("/api/v1")
public class PriorityController {
	@Autowired
	PriorityService priorityService;
	
	
	@PostMapping(value = "/priority")
	public ResponseEntity<?> createPriority(@RequestBody Priority priority) {
		priorityService.createPriority(priority);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	
	@GetMapping("/priority")
	  public List<Priority> getPriority() {
		return priorityService.getPriority();

	}
	

	@DeleteMapping("/priority/{id}")
    public ResponseEntity<?> deletePriority(@PathVariable Long id) { 
		priorityService.deletePriority(id);
		return ResponseEntity.ok().build();
    }
	
	
	@GetMapping("/getpriorityById/{priorityId}")
	public Optional<Priority> getPriorityById(@PathVariable(name = "priorityId") Long id){
	
//		return new ResponseEntity<Severity>(HttpStatus.OK);
		
		 return priorityService.getPriorityById(id);
	}
//	@GetMapping("/getseverityByname/{serverityName}")
//	public ResponseEntity<List<Severity>> getSeverityByName(@PathVariable(name = "serverityName") String name){
//	
////		return new ResponseEntity<Severity>(HttpStatus.OK);
//		
//		 return severityRepository.findByName(name);
//	}
	
	@PutMapping("/updatepriority/{id}")
	public ResponseEntity<Object> editPriority(@RequestBody Priority priority, @PathVariable ("id") long id) {

		Optional<Priority>PriorityOptional = priorityService.getPriorityById(id);

		if (!PriorityOptional.isPresent())
			return ResponseEntity.notFound().build();

		priority.setPriorityId(id);

		
		priorityService.createPriority(priority);

		return ResponseEntity.noContent().build();
	}

}