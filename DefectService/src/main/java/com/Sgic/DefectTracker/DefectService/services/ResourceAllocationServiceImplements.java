package com.Sgic.DefectTracker.DefectService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.entities.Module;
import com.Sgic.DefectTracker.DefectService.entities.ResourceAllocation;
import com.Sgic.DefectTracker.DefectService.repositories.ResourceAllocationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ResourceAllocationServiceImplements implements ResourceAllocationService {

	@Autowired
	ResourceAllocationRepository resourceallocationRepository;
	
	@Override
	public ResourceAllocation saveResourceAllocation(ResourceAllocation resourceallocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResourceAllocation updateResourceAllocation(ResourceAllocation module, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteModule(long id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Optional<ResourceAllocation> findByID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResourceAllocation> getAllResourceAllocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteResourceAllocation(long id) {
		// TODO Auto-generated method stub
		
	}
	

	
}
