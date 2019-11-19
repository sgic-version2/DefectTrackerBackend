package com.Sgic.DefectTracker.ProductService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.Sgic.DefectTracker.ProductService.entities.Role;
import com.Sgic.DefectTracker.ProductService.repository.RoleRepository;
@Service

public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;
	 @Transactional(readOnly = false)
	 public Role createRole(@RequestBody Role role) {
		 return roleRepository.save(role);
		 // return new ResponseEntity<Object>(HttpStatus.OK);
		 }
//
//		 public List<Severity> getSeverity() {
//		 return severityRepository.findAll();
//
//		 }
//
//		 public void deleteSeverity(@PathVariable Long id) {
//		 severityRepository.deleteById(id);
//		 // return ResponseEntity.ok().build();
//		 }
//
//		 public Optional<Severity> getSeverityById(@PathVariable(name = "serverityId") Long id) {
//
//		 // return new ResponseEntity<Severity>(HttpStatus.OK);
//
//		 return severityRepository.findById(id);
//		 }


	
//	 @Transactional(readOnly = false)
//	public boolean isRoleNameAlreadyExist(String role_name) {
//		
//		return roleRepository.isRoleNameAlreadyExist(role_name);
//	}

//	    @Transactional(readOnly = true)
//		public boolean isRoleNameAlreadyExist(String role_name) {
//			
//		}
//		
}
