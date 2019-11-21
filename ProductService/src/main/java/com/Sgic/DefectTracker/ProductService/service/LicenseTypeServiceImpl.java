package com.Sgic.DefectTracker.ProductService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.ProductService.entities.LicenseType;
import com.Sgic.DefectTracker.ProductService.repository.LicenseTypeRepository;
@Service
public class LicenseTypeServiceImpl implements LicenseTypeService
{
=======
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
>>>>>>> origin/vinojan
	@Autowired
	LicenseTypeRepository licenseTypeRepository;

	 
<<<<<<< HEAD
	public LicenseType createNote( LicenseType licenseType) {
=======
	public LicenseTypeEntity createNote( LicenseTypeEntity licenseType) {
>>>>>>> origin/vinojan
		return licenseTypeRepository.save(licenseType);
		 
	}
	 
<<<<<<< HEAD
	  public List<LicenseType> getLicenseType() {
=======
	  public List<LicenseTypeEntity> getLicenseType() {
>>>>>>> origin/vinojan
		return licenseTypeRepository.findAll();

	}

	 
    public void delete(Long id) { 
		  licenseTypeRepository.deleteById(id);
		 
    }
	 
<<<<<<< HEAD
	public Optional<LicenseType>  getlicenseTypeById( Long id){
=======
	public Optional<LicenseTypeEntity>  getlicenseTypeById( Long id){
>>>>>>> origin/vinojan
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
