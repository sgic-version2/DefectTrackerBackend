package com.Sgic.DefectTracker.ProductService.controller;

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

import com.Sgic.DefectTracker.ProductService.entities.PrivilegeDetails;
import com.Sgic.DefectTracker.ProductService.service.PrivilegeDetailsService;

@RestController
@RequestMapping("/api/v1")
public class PrivilegeDetailsController {
	
	@Autowired
	 PrivilegeDetailsService  privilegeDetailsService;

	@PostMapping(value = "/privilegeDetails")
	public ResponseEntity<?> createNote(@RequestBody PrivilegeDetails privilegeDetails) {
		privilegeDetailsService.createNote(privilegeDetails);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	@GetMapping("/privilegeDetails")
	  public List<PrivilegeDetails> getPrivilegeDetails() {
		return privilegeDetailsService.getPrivilegeDetails();

	}

	@DeleteMapping("/privilegeDetails/{id}")
   public ResponseEntity<?> delete(@PathVariable Long id) { 
		privilegeDetailsService.delete(id);
		return ResponseEntity.ok().build();
   }
	@GetMapping("/getprivilegeDetailsById/{id}")
	public Optional<PrivilegeDetails>  getprivilegeDetailsById(@PathVariable("id") Long id){
		return(privilegeDetailsService.getprivilegeDetailsById(id));
	}
	
	@PutMapping("/updateprivilegeDetails/{id}")
	public ResponseEntity<Object> updatePrivilegeDetailsEntity(@RequestBody PrivilegeDetails privilegeDetails, @PathVariable long id) {

		Optional<PrivilegeDetails> privilegeDetailsOptional = privilegeDetailsService.getprivilegeDetailsById(id);

		if (!privilegeDetailsOptional.isPresent())
			return ResponseEntity.notFound().build();

		privilegeDetails.setPDid(id);

		privilegeDetailsService.createNote(privilegeDetails);

		return ResponseEntity.noContent().build();
	}
	


}
