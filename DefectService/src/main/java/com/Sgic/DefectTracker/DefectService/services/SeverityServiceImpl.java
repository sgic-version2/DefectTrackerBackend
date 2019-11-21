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

	public Severity createSeverity(Severity severity) {
		return severityRepository.save(severity);

	}

	public List<Severity> getSeverity() {
		return severityRepository.findAll();

	}

	public void deleteSeverity(Long id) {
		severityRepository.deleteById(id);

	}

	public Optional<Severity> getSeverityById(Long id){
		return severityRepository.findById(id);
	}

}