package com.Sgic.DefectTracker.ProductService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sgic.DefectTracker.ProductService.controller.LicenseTypeController;
import com.Sgic.DefectTracker.ProductService.entities.LicenseTypeEntity;

public interface LicenseTypeRepository extends JpaRepository<LicenseTypeEntity, Long>{

	

}
