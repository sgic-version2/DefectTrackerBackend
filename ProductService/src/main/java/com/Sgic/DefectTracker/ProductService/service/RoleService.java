package com.Sgic.DefectTracker.ProductService.service;

import java.util.List;
import java.util.Optional;

import com.Sgic.DefectTracker.ProductService.entities.Role;

public interface RoleService {
	public Role createRole(Role role);

	public List<Role> getAllRole();

	public Optional<Role> findByID(Long Rid);

	public void deleteRole(long Rid);

}
