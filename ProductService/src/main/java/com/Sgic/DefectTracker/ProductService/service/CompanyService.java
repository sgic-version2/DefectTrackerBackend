package com.Sgic.DefectTracker.ProductService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.ProductService.entities.CompanyEntity;

@Service
public interface CompanyService {
	CompanyEntity saveCompany(CompanyEntity company);

	CompanyEntity updateCompany(CompanyEntity company, long id);

	void deleteCompany(long id);

	List<CompanyEntity> getAllCompany();

	Optional<CompanyEntity> findByID(long id);
}
	
//	public CompanyEntity createCompany(CompanyEntity company);
//
//	public void save(CompanyEntity company);
	
//	public boolean isEmailAlreadyExist(String email);
//	
//	public java.util.List<CompanyEntity> getAll();
//	
//	public void save(CompanyEntity company);
//
//	public Optional<CompanyEntity> findById(long id);
//
//	public void deleteById(long id);

