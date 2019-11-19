package com.Sgic.DefectTracker.ProductService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.Sgic.DefectTracker.ProductService.entities.CompanyEntity;
import com.Sgic.DefectTracker.ProductService.repository.CompanyRepository;

@Service
public class CompanyImpl implements CompanyService{
	
	@Autowired
	CompanyRepository CompanyRepository;

	@Override
	public CompanyEntity saveCompany(CompanyEntity company) {
	// TODO Auto-generated method stub
	return CompanyRepository.save(company);
	}

	@Override
	public CompanyEntity updateCompany(CompanyEntity company, long id) {
	// TODO Auto-generated method stub
	return CompanyRepository.save(company);
	}

	@Override
	public void deleteCompany(long id) {
		CompanyRepository.deleteById(id);

	}

	@Override
	public List<CompanyEntity> getAllCompany() {
	// TODO Auto-generated method stub
	return CompanyRepository.findAll();
	}

	@Override
	public Optional<CompanyEntity> findByID(long id) {
	// TODO Auto-generated method stub
	return CompanyRepository.findById(id);
	}

}
	
//	@Autowired
//	private CompanyRepository companyRepository;
//
//	@Transactional(readOnly = false)
//	public CompanyEntity createCompany(CompanyEntity company) {
//		CompanyEntity responseCompany = companyRepository.save(company);
//		return responseCompany;
//	}
//
//	@Override
//	public void save(CompanyEntity company) {
//		// TODO Auto-generated method stub
//		
//	}

//	@Transactional(readOnly = true)
//	public boolean isEmailAlreadyExist(String email) {
//		return companyRepository.existsByEmail(email);
//	}
//
//	@Override
//	public List<CompanyEntity> getAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void save(CompanyEntity company) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public Optional<CompanyEntity> findById(long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void deleteById(long id) {
//		// TODO Auto-generated method stub
//		
//	}


