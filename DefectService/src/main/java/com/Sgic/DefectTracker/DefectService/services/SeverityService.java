package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import com.Sgic.DefectTracker.DefectService.entities.Severity;

public interface SeverityService {
	

	// Method for Save Severity Entity
	public Severity createSeverity(Severity severity);

	// Method for Severity List
	public List<Severity> getSeverity();

	// Method for Getting One Severity Record by ID
	public Optional<Severity> getSeverityById(Long id);

	// Method for Getting One Severity Record by Id
	public void deleteSeverity(Long id);

}