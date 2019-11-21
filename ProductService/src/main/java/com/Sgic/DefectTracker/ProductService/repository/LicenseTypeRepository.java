package com.Sgic.DefectTracker.ProductService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
 
import org.springframework.stereotype.Repository;

import com.Sgic.DefectTracker.ProductService.entities.LicenseType;

@Repository
public interface LicenseTypeRepository extends JpaRepository<LicenseType,Long>{
 

	
 
=======

import com.Sgic.DefectTracker.ProductService.controller.LicenseTypeController;
import com.Sgic.DefectTracker.ProductService.entities.LicenseTypeEntity;

public interface LicenseTypeRepository extends JpaRepository<LicenseTypeEntity, Long>{

	
>>>>>>> origin/vinojan

}
