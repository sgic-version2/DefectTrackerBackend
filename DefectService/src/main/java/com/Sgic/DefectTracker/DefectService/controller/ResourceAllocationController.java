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
import com.Sgic.DefectTracker.DefectService.entities.ResourceAllocation;
import com.Sgic.DefectTracker.DefectService.services.ResourceAllocationService;


	@RestController
	@RequestMapping("/api/v1")
	public class ResourceAllocationController {

		@Autowired
		ResourceAllocationService resourceAllocationService;

		@PostMapping(value = "/resource")
		public ResponseEntity<?> createResourceAllocation(@RequestBody ResourceAllocation resource) {
			resourceAllocationService.createResourceAllocation(resource);
			return new ResponseEntity<Object>(HttpStatus.OK);
		}

		@GetMapping("/resource")
		public ResponseEntity<List<ResourceAllocation>> getResourceAllocation() {
			return new ResponseEntity<List<ResourceAllocation>>(resourceAllocationService.getResourceAllocation(), HttpStatus.OK);
		}

		@GetMapping("/getresourceById/{id}")
		public ResponseEntity<ResourceAllocation> getResourceAllocationById(@PathVariable(value = "id") Long id)
				throws ResourceNotFoundException {
			ResourceAllocation resource = resourceAllocationService.getResourceAllocationById(id)
					.orElseThrow(() -> new ResourceNotFoundException("ResourceAllocation not found for this id :: " + id));
			return ResponseEntity.ok().body(resource);
		}

		@DeleteMapping("/resource/{id}")
		public ResponseEntity<?> deleteResourceAllocation(@PathVariable Long id) {
			resourceAllocationService.deleteResourceAllocation(id);
			return new ResponseEntity<String>("ResourceAllocation successfully deleted", HttpStatus.OK);
		}

		@PutMapping("/updateresource/{id}")
		public ResponseEntity<Object> editResourceAllocation(@RequestBody ResourceAllocation resource,
				@PathVariable("id") Long id) {

			Optional<ResourceAllocation> resourceOptional = resourceAllocationService.getResourceAllocationById(id);

			if (!resourceOptional.isPresent())
				return new ResponseEntity<>("ResourceAllocation not found for this id", HttpStatus.NOT_FOUND);

		resource.setResourceId(id);

			resourceAllocationService.createResourceAllocation(resource);

			return new ResponseEntity<>("Severity successfully updated", HttpStatus.OK);
		}
}