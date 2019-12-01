package com.Sgic.DefectTracker.ProductService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.ProductService.entities.LicenseType;
import com.Sgic.DefectTracker.ProductService.entities.PrivilegeDetails;
import com.Sgic.DefectTracker.ProductService.repository.LicenseTypeRepository;
import com.Sgic.DefectTracker.ProductService.repository.PrivilegeDetailsRepository;

@Service
public class PrivilegeDetailsServiceImpl implements PrivilegeDetailsService{
	@Autowired
	PrivilegeDetailsRepository privilegeDetailsRepository;

	public PrivilegeDetails createNote(PrivilegeDetails privilegeDetails) {
		return privilegeDetailsRepository.save(privilegeDetails);

	}

	public List<PrivilegeDetails> getPrivilegeDetails() {
		return privilegeDetailsRepository.findAll();

	}

	public void delete(Long id) {
		privilegeDetailsRepository.deleteById(id);

	}

	public Optional<PrivilegeDetails> getprivilegeDetailsById(Long id) {
		return (privilegeDetailsRepository.findById(id));
	}
}
