package com.Sgic.DefectTracker.ProductService.service;

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

import com.Sgic.DefectTracker.ProductService.entities.LicenseTypeEntity;
import com.Sgic.DefectTracker.ProductService.repository.LicenseTypeRepository;

public class LicenseTypeServiceImpl {
	@Autowired
	LicenseTypeRepository licenseTypeRepository;

	 
	public LicenseTypeEntity createNote( LicenseTypeEntity licenseType) {
		return licenseTypeRepository.save(licenseType);
		 
	}
	 
	  public List<LicenseTypeEntity> getLicenseType() {
		return licenseTypeRepository.findAll();

	}

	 
    public void delete(Long id) { 
		  licenseTypeRepository.deleteById(id);
		 
    }
	 
	public Optional<LicenseTypeEntity>  getlicenseTypeById( Long id){
		return(licenseTypeRepository.findById(id));
	}
	
	 
//	public ResponseEntity<Object> updateLicenseTypeEntity(@RequestBody LicenseTypeEntity licenseType, @PathVariable long id) {
//
//		Optional<LicenseTypeEntity> licenseTypeOptional = licenseTypeRepository.findById(id);
//
//		if (!licenseTypeOptional.isPresent())
//			return ResponseEntity.notFound().build();
//
//		licenseType.setLid(id);
//
//		licenseTypeRepository.save(licenseType);
//
//		return ResponseEntity.noContent().build();
//	}
	


}
