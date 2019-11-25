package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.entities.DefectType;
import com.Sgic.DefectTracker.DefectService.repositories.DefectTypeRepository;

@Service
public class DefectTypeServiceImpl implements DefectTypeService {
	@Autowired
	DefectTypeRepository defectTypeRepository;

	public DefectType createDefectType(DefectType defectType) {
		return defectTypeRepository.save(defectType);

	}

	public List<DefectType> getDefectType() {
		return defectTypeRepository.findAll();

	}

	public void deleteDefectType(Long id) {
		defectTypeRepository.deleteById(id);

	}

	public Optional<DefectType> getDefectTypeById(Long id) {

		return defectTypeRepository.findById(id);
	}

}