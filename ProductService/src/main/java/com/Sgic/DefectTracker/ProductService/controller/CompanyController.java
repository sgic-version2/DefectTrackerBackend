package com.Sgic.DefectTracker.ProductService.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sgic.DefectTracker.ProductService.entities.CompanyEntity;
import com.Sgic.DefectTracker.ProductService.service.CompanyService;

@RestController
	@RequestMapping("/api/v1")
	@CrossOrigin
	public class CompanyController {
		@Autowired
		CompanyService dS;

		@PostMapping("/company")
		public HttpStatus createNote(@RequestBody CompanyEntity Company) {
			dS.save(Company);
			return HttpStatus.CREATED;
		}

//		@GetMapping("/company")
//		public List<CompanyEntity> get(CompanyEntity df) {
//			return dS.getAll();
//		}
//
//		@PutMapping("/company/{id}")
//		public ResponseEntity<Object> update(@RequestBody CompanyEntity company, @PathVariable long id) {
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


