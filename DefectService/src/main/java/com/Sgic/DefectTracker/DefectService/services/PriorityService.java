package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import com.Sgic.DefectTracker.DefectService.entities.Priority;



public interface PriorityService {
	

	// Method for Save Priority Entity
	public Priority createPriority(Priority priority);

	// Method for Priority List
	public List<Priority> getPriority();

	// Method for Getting One Priority Record by ID
	public Optional<Priority> getPriorityById(Long id);

	// Method for Getting One Priority Record by Id
	public void deletePriority(Long id);

}
