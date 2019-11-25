package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import com.Sgic.DefectTracker.DefectService.entities.Audit;

public interface AuditService {
	

	// Method for Save Audit Entity
	public Audit createAudit(Audit audit);

	// Method for Audit List
	public List<Audit> getAudit();

	// Method for Getting One Audit Record by ID
	public Optional<Audit> getAuditById(Long id);

	// Method for Getting One Audit Record by Id
	public void deleteAudit(Long id);
}
