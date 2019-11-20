package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import com.Sgic.DefectTracker.DefectService.entities.DefectEntity;


public interface DefectService {
	// Method for Save Defect Entity
		public DefectEntity createDefectEntity(DefectEntity defectEntity);

		// Method for Defect List
		public List<DefectEntity> getDefectEntity();

		// Method for Getting One Defect Record by ID
		public Optional<DefectEntity> getDefectEntityById(Long id);

		// Method for Getting One Defect Record by Id
		public void deleteDefectEntity(Long id);

}
