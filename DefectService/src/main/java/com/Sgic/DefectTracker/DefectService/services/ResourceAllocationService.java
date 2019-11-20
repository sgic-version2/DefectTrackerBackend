package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import com.Sgic.DefectTracker.DefectService.entities.Module;
import com.Sgic.DefectTracker.DefectService.entities.ResourceAllocation;

public interface ResourceAllocationService {
	ResourceAllocation saveResourceAllocation(ResourceAllocation resourceallocation);

	ResourceAllocation updateResourceAllocation(ResourceAllocation module, long id);

	void deleteModule(long id);

	List<ResourceAllocation> getAllResourceAllocation();

	Optional<ResourceAllocation> findByID(long id);


	void deleteResourceAllocation(long id);

}
