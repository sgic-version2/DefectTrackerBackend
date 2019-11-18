package com.Sgic.DefectTracker.ProductService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.ProductService.entities.Role;
import com.Sgic.DefectTracker.ProductService.repository.RoleRepository;
@Service

public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;
	public Role  createRole(Role role) {
		Role responseRole = roleRepository.save(role);
		// TODO Auto-generated method stub
		return responseRole;
	}

	public boolean isEmailAlreadyExist(String role_name) {
		return roleRepository.existsByEmail(role_name);
	
	}
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

}
