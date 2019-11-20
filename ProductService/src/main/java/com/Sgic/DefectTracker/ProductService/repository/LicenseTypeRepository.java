package com.Sgic.DefectTracker.ProductService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
 
import org.springframework.stereotype.Repository;

import com.Sgic.DefectTracker.ProductService.entities.LicenseType;

@Repository
public interface LicenseTypeRepository extends JpaRepository<LicenseType,Long>{
 

	
 

}
