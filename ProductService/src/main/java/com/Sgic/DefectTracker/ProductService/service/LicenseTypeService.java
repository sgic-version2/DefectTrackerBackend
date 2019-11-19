package com.Sgic.DefectTracker.ProductService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.ProductService.entities.LicenseTypeEntity;
@Service
public interface LicenseTypeService {
	public LicenseTypeEntity createNote(LicenseTypeEntity licenseType);

	public List<LicenseTypeEntity> getLicenseType();

	public void delete(Long id);

	public Optional<LicenseTypeEntity> getlicenseTypeById(Long id);
}
