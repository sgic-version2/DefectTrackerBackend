package com.Sgic.DefectTracker.ProductService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.ProductService.entities.LicenseType;
import com.Sgic.DefectTracker.ProductService.entities.PrivilegeDetails;
@Service
public interface PrivilegeDetailsService {
	public PrivilegeDetails createNote(PrivilegeDetails privilegeDetails);

	public List<PrivilegeDetails> getPrivilegeDetails();

	public void delete(Long id);

	public Optional<PrivilegeDetails> getprivilegeDetailsById(Long id);
}
