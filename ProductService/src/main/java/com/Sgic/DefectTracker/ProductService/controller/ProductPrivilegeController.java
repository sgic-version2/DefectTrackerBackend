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

import com.Sgic.DefectTracker.ProductService.dto.ProductPrivilegeDto;
import com.Sgic.DefectTracker.ProductService.dto.mapper.Mapper;
import com.Sgic.DefectTracker.ProductService.entities.ProductPrivilege;
import com.Sgic.DefectTracker.ProductService.service.ProductPrivilegeService;

@RestController
@RequestMapping("/api/v1")
public class ProductPrivilegeController {
	
	@Autowired
	ProductPrivilegeService productPrivilegeService;
	@Autowired
	private Mapper mapper;
	
	@PostMapping(value="/ProductPrivilege")
	public ResponseEntity<Object> createSeverity(@RequestBody ProductPrivilegeDto productPrivilegeDto) {
		
		ProductPrivilege productPrivilege = mapper.map(productPrivilegeDto, ProductPrivilege.class);
		
		//roleService.createRole(role);
		productPrivilegeService.createProductPrivilege(productPrivilege);
		return new ResponseEntity<>( HttpStatus.OK);

		}
	
	@GetMapping("/ProductPrivilege")
	public List<ProductPrivilege> getProductPrivilege() {
		return productPrivilegeService.getAllProductPrivileges();
	}
	
	@GetMapping("/ProductPrivilege/{PRid}")
	public Optional<ProductPrivilege> getPrivilegeById(@PathVariable("PRid") Long PRid){
		return productPrivilegeService.findByID(PRid);
//	return new ResponseEntity<CompanyEntity>(HttpStatus.OK);
	}
	
	@PutMapping("/ProductPrivilege/{PRid}")
	public ResponseEntity<Object> updateProductPrivilege(@RequestBody ProductPrivilege productPrivilege, @PathVariable long PRid) {
		Optional<ProductPrivilege> productPrivilegeOptional = productPrivilegeService.findByID(PRid);
					if (!productPrivilegeOptional.isPresent())
						return ResponseEntity.notFound().build();
					productPrivilege.setPRid(PRid);
					productPrivilegeService.createProductPrivilege(productPrivilege);
					return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/ProductPrivilege/{PRid}")
	public ResponseEntity<ProductPrivilege> deleteProductPrivilege(@PathVariable long PRid) {
		productPrivilegeService.deleteProductPrivilege(PRid);
		return new ResponseEntity<ProductPrivilege>(HttpStatus.NO_CONTENT);
	}
	

}
