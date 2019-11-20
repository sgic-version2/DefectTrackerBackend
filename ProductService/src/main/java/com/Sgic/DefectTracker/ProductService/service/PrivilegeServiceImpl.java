package com.Sgic.DefectTracker.ProductService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.Sgic.DefectTracker.ProductService.entities.Privilege;
import com.Sgic.DefectTracker.ProductService.repository.PrivilegeRepository;


@Service
public class PrivilegeServiceImpl implements PrivilegeService{

//	@Override
//	public Privilege createPrivilege(Privilege privilege) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	@Autowired
	private PrivilegeRepository privilegeRepository;
	@Transactional(readOnly = false)
	public Privilege createPrivilege(@RequestBody Privilege privilege) {
		 return privilegeRepository.save(privilege);
		 // return new ResponseEntity<Object>(HttpStatus.OK);
		 }
	@Override
	public List<Privilege> getAllPrivileges() {
		// TODO Auto-generated method stub
		return privilegeRepository.findAll();
	}
	@Override
	public Optional<Privilege> findByID(Long Pid) {
		// TODO Auto-generated method stub
		return privilegeRepository.findById(Pid);
	}
	@Override
	public void deletePrivilege(long Pid) {
		privilegeRepository.deleteById(Pid);
		
	}

	}
	
	
	


