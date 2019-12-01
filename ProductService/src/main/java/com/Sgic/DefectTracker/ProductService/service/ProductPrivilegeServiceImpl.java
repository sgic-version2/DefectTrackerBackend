package com.Sgic.DefectTracker.ProductService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

//import com.Sgic.DefectTracker.ProductService.entities.Privilege;
import com.Sgic.DefectTracker.ProductService.entities.ProductPrivilege;
import com.Sgic.DefectTracker.ProductService.repository.PrivilegeRepository;
import com.Sgic.DefectTracker.ProductService.repository.ProductPrivilegeRepository;

@Service
public class ProductPrivilegeServiceImpl implements ProductPrivilegeService {

	@Autowired
	private ProductPrivilegeRepository productPrivilegeRepository;

	@Transactional(readOnly = false)
	public ProductPrivilege createProductPrivilege(@RequestBody ProductPrivilege productPrivilege) {
		return productPrivilegeRepository.save(productPrivilege);
		// return new ResponseEntity<Object>(HttpStatus.OK);
	}

	@Override
	public List<ProductPrivilege> getAllProductPrivileges() {
		// TODO Auto-generated method stub
		return productPrivilegeRepository.findAll();
	}

	@Override
	public Optional<ProductPrivilege> findByID(Long PRid) {
		// TODO Auto-generated method stub
		return productPrivilegeRepository.findById(PRid);
	}

	@Override
	public void deleteProductPrivilege(long PRid) {
		productPrivilegeRepository.deleteById(PRid);
		
	}

}
