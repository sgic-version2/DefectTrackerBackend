package com.Sgic.DefectTracker.ProductService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
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

	

		 public void deleteSeverity(@PathVariable Long id) {
		 roleRepository.deleteById(id);
		 // return ResponseEntity.ok().build();
		 }

//		 public Optional<Role> getSeverityById(@PathVariable(name = "roleId") Long id) {
//
//		 // return new ResponseEntity<Severity>(HttpStatus.OK);
//
//		 return roleRepository.findById(id);
//		 }

		@Override
		public List<Role> getAllRole() {
			// TODO Auto-generated method stub
			return roleRepository.findAll();
		}

		@Override
		public Optional<Role> findByID(Long id) {
			// TODO Auto-generated method stub
			return roleRepository.findById(id);
		}

		@Override
		public void deleteRole(long id) {
			// TODO Auto-generated method stub
			 roleRepository.deleteById(id);
		}


	

}
