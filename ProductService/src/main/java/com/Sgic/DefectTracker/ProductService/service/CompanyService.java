package com.Sgic.DefectTracker.ProductService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.ProductService.entities.Company;

@Service
public interface CompanyService {
	Company saveCompany(Company company);

	Company updateCompany(Company company, long id);

	void deleteCompany(long id);

	List<Company> getAllCompany();

	Optional<Company> findByID(long id);
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

