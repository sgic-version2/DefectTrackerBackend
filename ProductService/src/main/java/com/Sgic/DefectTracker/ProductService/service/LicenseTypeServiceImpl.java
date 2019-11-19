package com.Sgic.DefectTracker.ProductService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.ProductService.entities.LicenseTypeEntity;
import com.Sgic.DefectTracker.ProductService.repository.LicenseTypeRepository;
@Service
public class LicenseTypeServiceImpl implements LicenseTypeService
{
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
