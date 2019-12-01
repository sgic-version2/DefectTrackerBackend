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

import com.Sgic.DefectTracker.ProductService.dto.PrivilegeDto;
import com.Sgic.DefectTracker.ProductService.dto.mapper.Mapper;
import com.Sgic.DefectTracker.ProductService.entities.Privilege;
import com.Sgic.DefectTracker.ProductService.service.PrivilegeService;

@RestController
@RequestMapping("/api/v1")
public class PrivilegeController {
	
	@Autowired
	private PrivilegeService privilegeService;
	@Autowired
	private Mapper mapper;
	
	@PostMapping(value="/privilege")
	public ResponseEntity<Object> createSeverity(@RequestBody PrivilegeDto privilegeDto) {
		// if (employeeService.isEmailAlreadyExist(employeeData.getEmail())) {
//		      logger.debug("Email already exists: createEmployee(), email: {}");
//		      return new ResponseEntity<>(new BasicResponse<>(
//		          new ValidationFailure(Constants.EMAIL, errorMessages.getEmailAlreadyExist()),
//		          RestApiResponseStatus.VALIDATION_FAILURE,ValidationMessages.EMAIL_EXIST), HttpStatus.BAD_REQUEST);
		// }
		Privilege privilege = mapper.map(privilegeDto, Privilege.class);
		
		//roleService.createRole(role);
		privilegeService.createPrivilege(privilege);
		return new ResponseEntity<>( HttpStatus.OK);

		}
	
	
	@GetMapping("/privilege")
	public List<Privilege> getPrivilege() {
		return privilegeService.getAllPrivileges();
	}
	
	@GetMapping("/privilege/{Pid}")
	public Optional<Privilege> getPrivilegeById(@PathVariable("Pid") Long Pid){
		return privilegeService.findByID(Pid);
//	return new ResponseEntity<CompanyEntity>(HttpStatus.OK);
	}
	
	@PutMapping("/privilege/{Pid}")
	public ResponseEntity<Object> updatePrivilege(@RequestBody Privilege privilege, @PathVariable long Pid) {
		Optional<Privilege> privilegeOptional = privilegeService.findByID(Pid);
					if (!privilegeOptional.isPresent())
						return ResponseEntity.notFound().build();
					privilege.setPid(Pid);
					privilegeService.createPrivilege(privilege);
					return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/privilege/{Pid}")
	public ResponseEntity<Privilege> deletePrivilege(@PathVariable long Pid) {
		privilegeService.deletePrivilege(Pid);
		return new ResponseEntity<Privilege>(HttpStatus.NO_CONTENT);
	}

	}


