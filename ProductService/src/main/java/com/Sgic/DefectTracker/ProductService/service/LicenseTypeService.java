package com.Sgic.DefectTracker.ProductService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.ProductService.entities.LicenseType;
@Service
public interface LicenseTypeService {
	public LicenseType createNote(LicenseType licenseType);

	public List<LicenseType> getLicenseType();

	public void delete(Long id);

	public Optional<LicenseType> getlicenseTypeById(Long id);
}
