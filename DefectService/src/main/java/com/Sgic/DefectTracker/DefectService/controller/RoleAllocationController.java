package com.Sgic.DefectTracker.DefectService.controller;

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

import com.Sgic.DefectTracker.DefectService.entities.RoleAllocation;
import com.Sgic.DefectTracker.DefectService.services.RoleAllocationService;



@RestController
@RequestMapping("/api/roa")
public class RoleAllocationController {
	
	@Autowired
	private RoleAllocationService roleallocationService;
	
	@PostMapping("/rolealloaction")
	public ResponseEntity<?> createNote(@RequestBody  RoleAllocation roleallocation) {
		
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

	@GetMapping("/rolealloaction")
	public RoleAllocationService getRoleallocationService() {
		return roleallocationService;
	}

	@PutMapping("/rolealloaction/{id}")
	public ResponseEntity<Object> updateRoleAllocation(@RequestBody RoleAllocation roleallocation, @PathVariable long id) {

		Optional<RoleAllocation>rolealloactionOptional =roleallocationService.findByID(id);

		if (!rolealloactionOptional.isPresent())
			return ResponseEntity.notFound().build();

		roleallocation.setRoleAllocation_id(id);
		roleallocationService.saveRoleAllocation(roleallocation);

		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/roleallocation/{id}")
	public void deleteResourceAllocation(@PathVariable long id) {		
		roleallocationService.deleteRoleAllocation(id);
	}

}
