package com.Sgic.DefectTracker.ProductService.service;

import java.util.Optional;

import com.Sgic.DefectTracker.ProductService.entities.CompanyEntity;

public interface CompanyService {
	public CompanyEntity createCompany(CompanyEntity company);

	public void save(CompanyEntity company);
	
//	public boolean isEmailAlreadyExist(String email);
//	
//	public java.util.List<CompanyEntity> getAll();
//	
//	public void save(CompanyEntity company);
//
//	public Optional<CompanyEntity> findById(long id);
//
//	public void deleteById(long id);
}
