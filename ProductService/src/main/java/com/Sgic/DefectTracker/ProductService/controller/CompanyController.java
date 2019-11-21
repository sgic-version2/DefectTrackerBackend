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

import com.Sgic.DefectTracker.ProductService.entities.Company;
import com.Sgic.DefectTracker.ProductService.service.CompanyService;

@RestController
	@RequestMapping("/api/v1")

	public class CompanyController {
		@Autowired
		CompanyService dS;

		@PostMapping("/company")
		public ResponseEntity<?> createNote(@RequestBody Company Company) {
			dS.saveCompany(Company);
			return new ResponseEntity<Object>(HttpStatus.OK) ;
		}

		@GetMapping("/company")
		public List<Company> getCompanyEntity() {
			return dS.getAllCompany();
		}
		
		@GetMapping("/company/{id}")
		public Optional<Company> getcompanyById(@PathVariable("id") Long id){
			return dS.findByID(id);
//		return new ResponseEntity<CompanyEntity>(HttpStatus.OK);
		}
		
		@PutMapping("/company/{id}")
		public ResponseEntity<Object> updateCompany(@RequestBody Company company, @PathVariable long id) {
			Optional<Company> companyOptional = dS.findByID(id);
						if (!companyOptional.isPresent())
							return ResponseEntity.notFound().build();
						company.setId(id);
						dS.saveCompany(company);
						return ResponseEntity.noContent().build();
		}
		
		@DeleteMapping("/company/{id}")
		public ResponseEntity<Company> deleteProject(@PathVariable long id) {
			dS.deleteCompany(id);
			return new ResponseEntity<Company>(HttpStatus.NO_CONTENT);
		}
//		@PutMapping("/company/{id}")
//		public ResponseEntity<Object> updatecompany(@RequestBody CompanyEntity company, @PathVariable long id) {
//
//		Optional<CompanyEntity>CompanyOptional = dS.findById(id);
//
//		if (!CompanyOptional.isPresent())
//		return ResponseEntity.notFound().build();
//		CompanyEntity companyEntity= new CompanyEntity();
//		companyEntity.setId(id);
//
//		dS.save(companyEntity);
//
//		return ResponseEntity.noContent().build();
//		}
//
//		@PutMapping("/company/{id}")
//		public ResponseEntity<?> update(@RequestBody CompanyEntity company, @PathVariable long id) {
//
//			Optional<CompanyEntity> companyOptional = dS.findById(id);
//
//			if (!companyOptional.isPresent())
//				return ResponseEntity.notFound().build();
//
//			company.setId(id);
//
//			dS.save(company);
//
//			return ResponseEntity.noContent().build();
//		}
//
//		@DeleteMapping("/company/{id}")
//		public void delete(@PathVariable long id) {
//			dS.deleteById(id);
//		}
	}


