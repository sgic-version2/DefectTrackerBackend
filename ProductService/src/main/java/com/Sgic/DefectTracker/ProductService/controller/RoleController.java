package com.Sgic.DefectTracker.ProductService.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Sgic.DefectTracker.ProductService.dto.RoleDto;
import com.Sgic.DefectTracker.ProductService.dto.mapper.Mapper;
import com.Sgic.DefectTracker.ProductService.entities.Role;
import com.Sgic.DefectTracker.ProductService.enums.RestApiResponseStatus;




@RestController
	@Autowired
	private RoleService roleService;
	@Autowired
	private Mapper mapper;
	@PostMapping(value = "/role")
	public ResponseEntity<Object> createRole(@RequestBody RoleDto roleDto) {
		if (roleService.isEmailAlreadyExist(roleDto.getRole_name())) {
		     
		
		     
		}
		
		Role role = mapper.map( roleDto, Role.class);
		roleService.createRole(role);
		
		
	}
}
