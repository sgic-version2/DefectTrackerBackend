package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import com.Sgic.DefectTracker.DefectService.entities.RoleAllocation;

public interface RoleAllocationService {
	RoleAllocation saveRoleAllocation(RoleAllocation roleallocation);

	RoleAllocation updateRoleAllocation(RoleAllocation module, long id);

	void deleteRoleAllocation(long id);

	List<RoleAllocation> getAllRoleAllocation();

	Optional<RoleAllocation> findByID(long id);
}
