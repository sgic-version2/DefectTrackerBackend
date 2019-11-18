package com.Sgic.DefectTracker.ProductService.controller;



import java.util.logging.Logger;

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
import com.Sgic.DefectTracker.ProductService.service.RoleService;




@RestController
public class RoleController
{
	@Autowired
	private RoleService roleService;
	
//	@Autowired
//	ErrorCodes errorMessages;

	@Autowired
	private Mapper mapper;
	
//	  private static final Logger logger = Logger.getLogger(RoleController.class);


	@PostMapping(value = "/employee")
	public ResponseEntity<Object> createEmployee(@RequestBody RoleDto roleData) {
//		if (roleService.isEmailAlreadyExist(roleData.getEmail())) {
//		      logger.debug("Email already exists: createEmployee(), email: {}");
//		      return new ResponseEntity<>(new BasicResponse<>(
//		          new ValidationFailure(Constants.EMAIL, errorMessages.getEmailAlreadyExist()),
//		          RestApiResponseStatus.VALIDATION_FAILURE,ValidationMessages.EMAIL_EXIST), HttpStatus.BAD_REQUEST);
//		}
		Role role = mapper.map(roleData, Role.class);
		roleService.createRole(role);
		return new ResponseEntity<>(new ApiResponse(), HttpStatus.OK);
		
	}

//	@GetMapping("/role")
//	  public List<Role> getRole() {
//		return roleService.findAll();
//
//	}
}
