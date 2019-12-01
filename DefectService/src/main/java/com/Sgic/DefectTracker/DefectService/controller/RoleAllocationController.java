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
import com.Sgic.DefectTracker.DefectService.entities.RoleAllocation;
import com.Sgic.DefectTracker.DefectService.services.RoleAllocationService;

@RestController
@RequestMapping("/api/v1")
public class RoleAllocationController {

	@Autowired
	RoleAllocationService roleAllocationService;

	@PostMapping(value = "/roleAllocation")
	public ResponseEntity<?> createRoleAllocation(@RequestBody RoleAllocation role) {
		roleAllocationService.createRoleAllocation(role);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

	@GetMapping("/roleAllocation")
	public ResponseEntity<List<RoleAllocation>> getRoleAllocation() {
		return new ResponseEntity<List<RoleAllocation>>(roleAllocationService.getRoleAllocation(), HttpStatus.OK);
	}

	@GetMapping("/roleAllocationById/{id}")
	public ResponseEntity<RoleAllocation> getRoleAllocationById(@PathVariable(value = "id") Long id)
			throws ResourceNotFoundException {
		RoleAllocation role = roleAllocationService.getRoleAllocationById(id)
				.orElseThrow(() -> new ResourceNotFoundException("RoleAllocation not found for this id :: " + id));
		return ResponseEntity.ok().body(role);
	}

	@DeleteMapping("/roleAllocation/{id}")
	public ResponseEntity<?> deleteRoleAllocation(@PathVariable Long id) {
		roleAllocationService.deleteRoleAllocation(id);
		return new ResponseEntity<String>("RoleAllocation successfully deleted", HttpStatus.OK);
	}

	@PutMapping("/updateRoleAllocation/{id}")
	public ResponseEntity<Object> editRoleAllocation(@RequestBody RoleAllocation role, @PathVariable("id") Long id) {

		Optional<RoleAllocation> roleOptional = roleAllocationService.getRoleAllocationById(id);

		if (!roleOptional.isPresent())
			return new ResponseEntity<>("RoleAllocation not found for this id", HttpStatus.NOT_FOUND);

		role.setRoleAllocationId(id);

		roleAllocationService.createRoleAllocation(role);

		return new ResponseEntity<>("RoleAllocation successfully updated", HttpStatus.OK);
	}
}