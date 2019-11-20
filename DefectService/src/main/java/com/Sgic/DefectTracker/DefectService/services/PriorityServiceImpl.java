package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Sgic.DefectTracker.DefectService.entities.Priority;
import com.Sgic.DefectTracker.DefectService.repositories.PriorityRepository;

@Service
public class PriorityServiceImpl implements PriorityService {
	@Autowired
	PriorityRepository priorityRepository;

	public Priority createPriority(@RequestBody Priority priority) {
		return priorityRepository.save(priority);

	}

	public List<Priority> getPriority() {
		return priorityRepository.findAll();

	}

	public void deletePriority(Long id) {
		priorityRepository.deleteById(id);

	}

	public Optional<Priority> getPriorityById(Long id) {

		return priorityRepository.findById(id);
	}

}
