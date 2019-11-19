package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.entities.DefectStatus;

@Service
public interface DefectStatusService {
	// Method for Save DefectStatus Entity
			public DefectStatus createDefectStatus(DefectStatus defectStatus);

			// Method for DefectStatus List
			public List<DefectStatus> getDefectStatus();

			// Method for Getting One DefectStatus Record by ID
			public Optional<DefectStatus> getDefectStatusById(Long id);

			// Method for Getting One DefectStatus Record by Id
			public void deleteDefectStatus(Long id);

}
