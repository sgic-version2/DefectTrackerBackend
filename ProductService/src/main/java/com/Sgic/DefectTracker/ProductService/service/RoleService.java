package com.Sgic.DefectTracker.ProductService.service;

import java.util.List;

import com.Sgic.DefectTracker.ProductService.entities.Role;

public interface RoleService {
	public Role createRole(Role role);
	public boolean isEmailAlreadyExist(String role_name);
	public List<Role> findAll();
}
