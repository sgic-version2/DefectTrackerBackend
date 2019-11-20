package com.Sgic.DefectTracker.DefectService.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.entities.RoleAllocation;
import com.Sgic.DefectTracker.DefectService.repositories.RoleAllocationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RoleAllocationServiceImplements implements RoleAllocationService  {
	@Autowired
	RoleAllocationRepository roleAllocationRepository;
	
	@Override
	public RoleAllocation saveRoleAllocation(RoleAllocation module) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoleAllocation updateRoleAllocation(RoleAllocation module, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRoleAllocation(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RoleAllocation> getAllRoleAllocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<RoleAllocation> findByID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
