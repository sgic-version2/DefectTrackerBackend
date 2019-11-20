package com.Sgic.DefectTracker.ProductService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.ProductService.entities.LicenseTypeEntity;
import com.Sgic.DefectTracker.ProductService.entities.PrivilegeDetailsEntity;
@Service
public interface PrivilegeDetailsService {
	public PrivilegeDetailsEntity createNote(PrivilegeDetailsEntity privilegeDetails);

	public List<PrivilegeDetailsEntity> getPrivilegeDetails();

	public void delete(Long id);

	public Optional<PrivilegeDetailsEntity> getprivilegeDetailsById(Long id);
}
