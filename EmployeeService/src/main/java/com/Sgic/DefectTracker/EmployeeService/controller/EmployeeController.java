package com.Sgic.DefectTracker.EmployeeService.controller;

//import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Sgic.DefectTracker.EmployeeService.dto.EmployeeDto;
import com.Sgic.DefectTracker.EmployeeService.dto.mapper.EmployeeMapper;
import com.Sgic.DefectTracker.EmployeeService.entities.EmployeeEntity;
import com.Sgic.DefectTracker.EmployeeService.service.EmployeeService;



@RestController

public class EmployeeController {

	@Autowired
EmployeeService employeeService;
	@Autowired
	private EmployeeMapper mapper;
//	@PostMapping("/employee")
//	public ResponseEntity<?> createNote(@RequestBody EmployeeEntity employeeEntity)
//	{
//		employeeService.createNote(employeeEntity);
//		
//		return new ResponseEntity<Object>(HttpStatus.OK);
//	}
	
	
	@PostMapping(value = "/employee")
	public ResponseEntity<Object> createEmployee(@RequestBody EmployeeDto employeeData) {
//		if (employeeService.isEmailAlreadyExist(employeeData.getEmail())) {
//		      logger.debug("Email already exists: createEmployee(), email: {}");
//		      return new ResponseEntity<>(new BasicResponse<>(
//		          new ValidationFailure(Constants.EMAIL, errorMessages.getEmailAlreadyExist()),
//		          RestApiResponseStatus.VALIDATION_FAILURE,ValidationMessages.EMAIL_EXIST), HttpStatus.BAD_REQUEST);
//		}
		EmployeeEntity employeeEntity = mapper.map(employeeData, EmployeeEntity.class);
		employeeService.createNote(employeeEntity);
		return new ResponseEntity<>(HttpStatus.OK);}
	
//	@GetMapping("/employee")
//	public ResponseEntity<EmployeeEntity>getEmployee()
//	{
//		//EmployeeEntity employeeEntity = mapper.map(employeeData, EmployeeEntity.class);
//		//employeeService.createNote(employeeEntity);
//		EmployeeEntity employeeentity = (EmployeeEntity) employeeService.getEmployee();
//		EmployeeEntity EmployeeDto = mapper.map(EmployeeEntity.class);
//		
//		return new ResponseEntity<EmployeeEntity>(EmployeeDto.HttpStatus.OK);
//		}
//		
	
	
	@GetMapping("/employee")
	public List<EmployeeEntity>getEmployee()
	{
		return employeeService.getEmployee();
	}
	
	
	@DeleteMapping("/employee/{id}")
    public ResponseEntity<?> deleteemployee(@PathVariable Long id) {
		employeeService.deleteemployee(id);
return  ResponseEntity.ok().build();
    }
	
//	@DeleteMapping("/employee/{id}")
//	public Map<String,Boolean>deleteproject(@PathVariable(value="id")Long id)
//	throws ResourceNotFoundException{
//		EmployeeEntity employeeEntity=employeeRepostories.findById(id)
//		.orElseThrow(()->new ResourceNotFoundException("Project not found for this id::"+id));
//		employeeRepostories.delete(employeeEntity);
//		Map<String,Boolean>response= new HashMap<>();
//		response.put("deleted",Boolean.TRUE);
//		return response;
//		
//	
//	}
	@GetMapping("/getemployeeById/{id}")
	public Optional<EmployeeEntity> getEmployeeById(@PathVariable("id") Long id){
	return(employeeService.getEmployeeById(id));
	}
	
	@PutMapping("/updateproject/{id}")
	public ResponseEntity<Object> updateEmployee(@RequestBody EmployeeEntity employeeEntity, @PathVariable long id) {

	Optional<EmployeeEntity> projectOptional = employeeService.getEmployeeById(id);

	if (!projectOptional.isPresent())
	return ResponseEntity.notFound().build();

	employeeEntity.setEmployeeId(id);

	employeeService.createNote(employeeEntity);

	return ResponseEntity.noContent().build();
	}
	
	
}
