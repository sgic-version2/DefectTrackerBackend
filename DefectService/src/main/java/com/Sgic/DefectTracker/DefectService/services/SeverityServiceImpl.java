package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.Sgic.DefectTracker.DefectService.services.SeverityService;

import com.Sgic.DefectTracker.DefectService.entities.Severity;
import com.Sgic.DefectTracker.DefectService.repositories.SeverityRepository;


@Service
public class SeverityServiceImpl implements SeverityService {
	@Autowired
	SeverityRepository severityRepository;

	public Severity createSeverity(@RequestBody Severity severity) {
		return severityRepository.save(severity);
//		return new ResponseEntity<Object>(HttpStatus.OK);
	}

	public List<Severity> getSeverity() {
		return severityRepository.findAll();

	}

	public void deleteSeverity(@PathVariable Long id) {
		severityRepository.deleteById(id);
//		return ResponseEntity.ok().build();
	}

	public Optional<Severity> getSeverityById(@PathVariable(name = "serverityId") Long id) {

//		return new ResponseEntity<Severity>(HttpStatus.OK);

		return severityRepository.findById(id);
	}

	

	

	


}
