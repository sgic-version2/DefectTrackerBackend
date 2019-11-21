package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.entities.Audit;
import com.Sgic.DefectTracker.DefectService.repositories.AuditRepository;

@Service
public class AuditServiceImpl implements AuditService {
	@Autowired
	AuditRepository auditRepository;

	public Audit createAudit(Audit audit) {
		return auditRepository.save(audit);

	}

	public List<Audit> getAudit() {
		return auditRepository.findAll();

	}

	public void deleteAudit(Long id) {
		auditRepository.deleteById(id);

	}

	public Optional<Audit> getAuditById(Long id){
		return auditRepository.findById(id);
	}

}

