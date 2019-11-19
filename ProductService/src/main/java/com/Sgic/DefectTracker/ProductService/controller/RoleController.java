package com.Sgic.DefectTracker.ProductService.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Sgic.DefectTracker.ProductService.dto.RoleDto;
import com.Sgic.DefectTracker.ProductService.dto.mapper.Mapper;
import com.Sgic.DefectTracker.ProductService.entities.Role;
import com.Sgic.DefectTracker.ProductService.service.RoleService;




@RestController
public class RoleController
{
	@Autowired
	private RoleService roleService;
	@Autowired
	private Mapper mapper;
	
	@PostMapping(value = "/role")
	public ResponseEntity<Object> createSeverity(@RequestBody RoleDto roleDto) {
	// if (employeeService.isEmailAlreadyExist(employeeData.getEmail())) {
//	      logger.debug("Email already exists: createEmployee(), email: {}");
//	      return new ResponseEntity<>(new BasicResponse<>(
//	          new ValidationFailure(Constants.EMAIL, errorMessages.getEmailAlreadyExist()),
//	          RestApiResponseStatus.VALIDATION_FAILURE,ValidationMessages.EMAIL_EXIST), HttpStatus.BAD_REQUEST);
	// }
	Role role = mapper.map(roleDto, Role.class);
	
	roleService.createRole(role);
	return new ResponseEntity<>( HttpStatus.OK);

	}

}
