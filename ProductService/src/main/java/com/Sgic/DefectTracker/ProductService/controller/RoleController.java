package com.Sgic.DefectTracker.ProductService.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sgic.DefectTracker.ProductService.dto.RoleDto;
import com.Sgic.DefectTracker.ProductService.dto.mapper.Mapper;
import com.Sgic.DefectTracker.ProductService.entities.Role;
import com.Sgic.DefectTracker.ProductService.service.RoleService;




@RestController
@RequestMapping("/api/v1")
public class RoleController
{
	@Autowired
	private RoleService roleService;
	@Autowired
	private Mapper mapper;
	
	@PostMapping(value = "/role")
	public ResponseEntity<Object> createRole(@RequestBody RoleDto roleDto) {
	Role role = mapper.map(roleDto, Role.class);
	roleService.createRole(role);
	return new ResponseEntity<>( HttpStatus.OK);
	}
	@GetMapping("/role")
	public List<Role> getRole() {
		return roleService.getAllRole();
	}
	
	@GetMapping("/role/{Rid}")
	public Optional<Role> getRoleById(@PathVariable("Rid") Long Rid){
		return roleService.findByID(Rid);
//	return new ResponseEntity<CompanyEntity>(HttpStatus.OK);
	}
	
	@PutMapping("/role/{Rid}")
	public ResponseEntity<Object> updateRole(@RequestBody Role role, @PathVariable long Rid) {
		Optional<Role> roleOptional = roleService.findByID(Rid);
					if (!roleOptional.isPresent())
						return ResponseEntity.notFound().build();
					role.setRid(Rid);
					roleService.createRole(role);
					return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/role/{Rid}")
	public ResponseEntity<Role> deleteRole(@PathVariable long Rid) {
		roleService.deleteRole(Rid);
		return new ResponseEntity<Role>(HttpStatus.NO_CONTENT);
	}
	

}
