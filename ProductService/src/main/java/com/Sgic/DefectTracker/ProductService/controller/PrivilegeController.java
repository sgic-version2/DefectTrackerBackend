package com.Sgic.DefectTracker.ProductService.controller;

//import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Sgic.DefectTracker.ProductService.dto.ProductDto;
import com.Sgic.DefectTracker.ProductService.dto.mapper.ProductMapper;
import com.Sgic.DefectTracker.ProductService.service.PrivilegeService;
import com.Sgic.DefectTracker.ProductService.util.Constants;
//import com.sgic.employee.server.util.ErrorCodes;
//import com.sgic.employee.server.controller.EmployeeController;
import com.sgic.common.api.enums.RestApiResponseStatus;
import com.sgic.common.api.response.BasicResponse;
import com.sgic.common.api.response.ValidationFailure;
import com.sgic.employee.server.dto.EmployeeDto;
import com.sgic.employee.server.util.ValidationMessages;

@RestController
public class PrivilegeController {

	@Autowired
	private PrivilegeService privilegeService;

	@Autowired
	Constants constant;

	@Autowired
	private ProductMapper mapper;

//	private static final Logger logger = Logger.getLogger(PrivilegeController.class);
	
//	@PostMapping(value="/privilage")
//	public ResponseEntity<Object> createPrivilage(@RequestBody ProductDto privilageData) {
//		if (privilegeService.isEmailAlreadyExist(privilageData.getEmail())) {
//		      logger.debug("Email already exists: createEmployee(), email: {}");
//		      return new ResponseEntity<>(new BasicResponse<>(
//		          new ValidationFailure(Constants.EMAIL, errorMessages.getEmailAlreadyExist()),
//		          RestApiResponseStatus.VALIDATION_FAILURE,ValidationMessages.EMAIL_EXIST), HttpStatus.BAD_REQUEST);
}
