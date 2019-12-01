package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import com.Sgic.DefectTracker.DefectService.entities.RoleAllocation;

public interface RoleAllocationService {
	// Method for Save RoleAllocation Entity
	public RoleAllocation createRoleAllocation(RoleAllocation roleAllocation);

	// Method for RoleAllocation List
	public List<RoleAllocation> getRoleAllocation();

	// Method for Getting One RoleAllocation Record by ID
	public Optional<RoleAllocation> getRoleAllocationById(Long id);

	// Method for Getting One RoleAllocation Record by Id
	public void deleteRoleAllocation(Long id);

}
