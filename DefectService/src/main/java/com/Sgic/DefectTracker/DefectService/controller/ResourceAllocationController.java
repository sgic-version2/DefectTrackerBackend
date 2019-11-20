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

import com.Sgic.DefectTracker.DefectService.entities.ResourceAllocation;
import com.Sgic.DefectTracker.DefectService.services.ResourceAllocationService;


@RestController
@RequestMapping("/api/ra")

public class ResourceAllocationController {
	@Autowired
	private ResourceAllocationService resourceallocationService;
	
	@PostMapping("/resourcealloaction")
	public ResponseEntity<?> createNote(@RequestBody  ResourceAllocation resourceallocation) {
		
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@GetMapping("/resourcealloaction")
	public List<ResourceAllocation> getResourceAllocation() {
		return resourceallocationService.getAllResourceAllocation();

	}
	
	@PutMapping("/resourceallocation/{id}")
	public ResponseEntity<Object> updateResourceAllocation(@RequestBody ResourceAllocation resourceallocation, @PathVariable long id) {

		Optional<ResourceAllocation> resourceallocationOptional = resourceallocationService.findByID(id);

		if (!resourceallocationOptional.isPresent())
			return ResponseEntity.notFound().build();

		resourceallocation.setResource_id(id);
		resourceallocationService.saveResourceAllocation(resourceallocation);

		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/resourceallocation/{id}")
	public void deleteResourceAllocation(@PathVariable long id) {		
		resourceallocationService.deleteResourceAllocation(id);
	}
	
	
}
