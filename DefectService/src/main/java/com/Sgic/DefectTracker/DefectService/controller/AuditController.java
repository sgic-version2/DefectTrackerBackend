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

import com.Sgic.DefectTracker.DefectService.entities.Audit;
import com.Sgic.DefectTracker.DefectService.services.AuditService;

@RestController

@RequestMapping("/api/v1")
public class AuditController {
	@Autowired
	AuditService auditService;
	
	
	@PostMapping(value = "/audit")
	public ResponseEntity<?> createAudit(@RequestBody Audit audit) {
		auditService.createAudit(audit);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	
	@GetMapping("/audit")
	  public List<Audit> getAudit() {
		return auditService.getAudit();

	}
	

	@DeleteMapping("/audit/{id}")
    public ResponseEntity<?> deleteAudit(@PathVariable Long id) { 
		auditService.deleteAudit(id);
		return ResponseEntity.ok().build();
    }
	
	
	@GetMapping("/getauditById/{id}")
	public Optional<Audit> getAuditById(@PathVariable(name = "id") Long id){
	
		
		 return auditService.getAuditById(id);
	}

	
	@PutMapping("/updateaudit/{id}")
	public ResponseEntity<Object> editAudit(@RequestBody Audit audit, @PathVariable ("id") long id) {

		Optional<Audit>AuditOptional = auditService.getAuditById(id);

		if (!AuditOptional.isPresent())
			return ResponseEntity.notFound().build();

		audit.setAuditId(id);

		
		auditService.createAudit(audit);

		return ResponseEntity.noContent().build();
	}

}

