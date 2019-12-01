package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import com.Sgic.DefectTracker.DefectService.entities.ResourceAllocation;


public interface ResourceAllocationService {
	// Method for Save ResourceAllocation Entity
		public ResourceAllocation createResourceAllocation(ResourceAllocation resourceAllocation);

		// Method for ResourceAllocation List
		public List<ResourceAllocation> getResourceAllocation();

		// Method for Getting One ResourceAllocation Record by ID
		public Optional<ResourceAllocation> getResourceAllocationById(Long id);

		// Method for Getting One ResourceAllocation Record by Id
		public void deleteResourceAllocation(Long id);
}
