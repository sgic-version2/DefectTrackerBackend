package com.Sgic.DefectTracker.ProductService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Sgic.DefectTracker.ProductService.entities.CompanyEntity;
import com.Sgic.DefectTracker.ProductService.repository.CompanyRepository;

@Service
public class CompanyImpl implements CompanyService{
	
	@Autowired
	private CompanyRepository companyRepository;

	@Transactional(readOnly = false)
	public CompanyEntity createCompany(CompanyEntity company) {
		CompanyEntity responseCompany = companyRepository.save(company);
		return responseCompany;
	}

	@Override
	public void save(CompanyEntity company) {
		// TODO Auto-generated method stub
		
	}

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

}
