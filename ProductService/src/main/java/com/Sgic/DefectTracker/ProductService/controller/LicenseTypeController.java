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

import com.Sgic.DefectTracker.ProductService.entities.LicenseTypeEntity;
import com.Sgic.DefectTracker.ProductService.repository.LicenseTypeRepository;
import com.Sgic.DefectTracker.ProductService.service.LicenseTypeServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class LicenseTypeController {
	@Autowired
	LicenseTypeRepository licenseTypeRepository;

	@PostMapping(value = "/licenseType")
	public ResponseEntity<?> createNote(@RequestBody LicenseTypeEntity licenseType) {
		licenseTypeRepository.save(licenseType);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	@GetMapping("/licenseType")
	  public List<LicenseTypeEntity> getLicenseType() {
		return licenseTypeRepository.findAll();

	}

	@DeleteMapping("/licenseType/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) { 
		licenseTypeRepository.deleteById(id);
		return ResponseEntity.ok().build();
    }
	@GetMapping("/getlicenseTypeById/{id}")
	public Optional<LicenseTypeEntity>  getlicenseTypeById(@PathVariable("id") Long id){
		return(licenseTypeRepository.findById(id));
	}
	
	@PutMapping("/updatelicenseType/{id}")
	public ResponseEntity<Object> updateLicenseTypeEntity(@RequestBody LicenseTypeEntity licenseType, @PathVariable long id) {

		Optional<LicenseTypeEntity> licenseTypeOptional = licenseTypeRepository.findById(id);

		if (!licenseTypeOptional.isPresent())
			return ResponseEntity.notFound().build();

		licenseType.setLid(id);

		licenseTypeRepository.save(licenseType);

		return ResponseEntity.noContent().build();
	}
	

}
