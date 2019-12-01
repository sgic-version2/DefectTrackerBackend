package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.entities.ResourceAllocation;
import com.Sgic.DefectTracker.DefectService.repositories.ResourceAllocationRepository;
@Service
public class ResourceAllocationServiceImpl implements ResourceAllocationService {
	@Autowired
	ResourceAllocationRepository resourceAllocationRepository;

	@Override
	public ResourceAllocation createResourceAllocation(ResourceAllocation resourceAllocation) {

		return resourceAllocationRepository.save(resourceAllocation);
	}

	@Override
	public List<ResourceAllocation> getResourceAllocation() {

		return resourceAllocationRepository.findAll();
	}

	@Override
	public Optional<ResourceAllocation> getResourceAllocationById(Long id) {

		return resourceAllocationRepository.findById(id);
	}

	@Override
	public void deleteResourceAllocation(Long id) {

		resourceAllocationRepository.deleteById(id);

	}

}
