package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import com.Sgic.DefectTracker.DefectService.entities.Defect;


public interface DefectService {
	// Method for Save Defect Entity
		public Defect createDefectEntity(Defect defectEntity);

		// Method for Defect List
		public List<Defect> getDefectEntity();

		// Method for Getting One Defect Record by ID
		public Optional<Defect> getDefectEntityById(Long id);

		// Method for Getting One Defect Record by Id
		public void deleteDefectEntity(Long id);

}
