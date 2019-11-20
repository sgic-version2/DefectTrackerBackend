package com.Sgic.DefectTracker.ProductService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.ProductService.entities.LicenseTypeEntity;
import com.Sgic.DefectTracker.ProductService.entities.PrivilegeDetailsEntity;
import com.Sgic.DefectTracker.ProductService.repository.LicenseTypeRepository;
import com.Sgic.DefectTracker.ProductService.repository.PrivilegeDetailsRepository;

@Service
public class PrivilegeDetailsServiceImpl implements PrivilegeDetailsService{
	@Autowired
	PrivilegeDetailsRepository privilegeDetailsRepository;

	public PrivilegeDetailsEntity createNote(PrivilegeDetailsEntity privilegeDetails) {
		return privilegeDetailsRepository.save(privilegeDetails);

	}

	public List<PrivilegeDetailsEntity> getPrivilegeDetails() {
		return privilegeDetailsRepository.findAll();

	}

	public void delete(Long id) {
		privilegeDetailsRepository.deleteById(id);

	}

	public Optional<PrivilegeDetailsEntity> getprivilegeDetailsById(Long id) {
		return (privilegeDetailsRepository.findById(id));
	}
}
