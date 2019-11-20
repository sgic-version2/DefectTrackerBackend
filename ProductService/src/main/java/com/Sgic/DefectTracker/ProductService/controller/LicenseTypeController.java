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

import com.Sgic.DefectTracker.ProductService.entities.LicenseType;
import com.Sgic.DefectTracker.ProductService.repository.LicenseTypeRepository;
import com.Sgic.DefectTracker.ProductService.service.LicenseTypeService;
import com.Sgic.DefectTracker.ProductService.service.LicenseTypeServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class LicenseTypeController {
	@Autowired
	 LicenseTypeService  licenseTypeService;

	@PostMapping(value = "/licenseType")
	public ResponseEntity<?> createNote(@RequestBody LicenseType licenseType) {
		licenseTypeService.createNote(licenseType);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	@GetMapping("/licenseType")
	  public List<LicenseType> getLicenseType() {
		return licenseTypeService.getLicenseType();

	}

	@DeleteMapping("/licenseType/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) { 
		licenseTypeService.delete(id);
		return ResponseEntity.ok().build();
    }
	@GetMapping("/getlicenseTypeById/{id}")
	public Optional<LicenseType>  getlicenseTypeById(@PathVariable("id") Long id){
		return(licenseTypeService.getlicenseTypeById(id));
	}
	
	@PutMapping("/updatelicenseType/{id}")
	public ResponseEntity<Object> updateLicenseTypeEntity(@RequestBody LicenseType licenseType, @PathVariable long id) {

		Optional<LicenseType> licenseTypeOptional = licenseTypeService.getlicenseTypeById(id);

		if (!licenseTypeOptional.isPresent())
			return ResponseEntity.notFound().build();

		licenseType.setLid(id);

		licenseTypeService.createNote(licenseType);

		return ResponseEntity.noContent().build();
	}
	
 

}
