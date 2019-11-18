package com.Sgic.DefectTracker.ProductService.service;

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
	@Override
	public boolean isEmailAlreadyExist(String role_name) {
		return roleRepository.existsByEmail(role_name);
	
	}

}
