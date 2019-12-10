package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.entities.RoleAllocation;
import com.Sgic.DefectTracker.DefectService.repositories.RoleAllocationRepository;

@Service
public class RoleAllocationServiceImpl implements RoleAllocationService {

	@Autowired
	RoleAllocationRepository roleAllocationRepository;

	@Override
	public RoleAllocation createRoleAllocation(RoleAllocation roleAllocation) {

		return roleAllocationRepository.save(roleAllocation);
	}

	@Override
	public List<RoleAllocation> getRoleAllocation() {

		return roleAllocationRepository.findAll();
	}

	@Override
	public Optional<RoleAllocation> getRoleAllocationById(Long id) {

		return roleAllocationRepository.findById(id);
	}

	@Override
	public void deleteRoleAllocation(Long id) {

		roleAllocationRepository.deleteById(id);

	}
}