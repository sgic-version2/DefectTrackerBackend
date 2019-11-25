package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.entities.DefectType;
@Service
public interface DefectTypeService {
	// Method for Save DefectType Entity
		public DefectType createDefectType(DefectType defectType);

		// Method for DefectType List
		public List<DefectType> getDefectType();

		// Method for Getting One DefectType Record by ID
		public Optional<DefectType> getDefectTypeById(Long id);

		// Method for Getting One DefectType Record by Id
		public void deleteDefectType(Long id);

}
