package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.Sgic.DefectTracker.DefectService.entities.Priority;
import com.Sgic.DefectTracker.DefectService.repositories.PriorityRepository;

@Service
public class PriorityServiceImpl implements PriorityService {
	@Autowired
	PriorityRepository priorityRepository;

	public Priority createPriority(@RequestBody Priority priority) {
		return priorityRepository.save(priority);
//		return new ResponseEntity<Object>(HttpStatus.OK);
	}

	public List<Priority> getPriority() {
		return priorityRepository.findAll();

	}

	public void deletePriority(@PathVariable Long id) {
		priorityRepository.deleteById(id);
//		return ResponseEntity.ok().build();
	}

	public Optional<Priority> getPriorityById(@PathVariable(name = "PriorityId") Long id) {

//		return new ResponseEntity<Priority>(HttpStatus.OK);

		return priorityRepository.findById(id);
	}

	

	

}
