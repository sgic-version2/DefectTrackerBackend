package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.entities.DefectEntity;
import com.Sgic.DefectTracker.DefectService.repositories.DefectRepository;
@Service
public class DefectServiceImpl implements DefectService {
	@Autowired
	DefectRepository DefectRepository;

	@Override
	public DefectEntity createDefectEntity(DefectEntity defectEntity) {
		return DefectRepository.save(defectEntity);
	}

	@Override
	public List<DefectEntity> getDefectEntity() {
		return DefectRepository.findAll();
	}

	@Override
	public Optional<DefectEntity> getDefectEntityById(Long id) {
		return DefectRepository.findById(id);
	}

	@Override
	public void deleteDefectEntity(Long id) {
		DefectRepository.deleteById(id);

	}

}
