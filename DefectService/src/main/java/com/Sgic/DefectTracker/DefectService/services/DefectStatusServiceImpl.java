package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.entities.DefectStatus;
import com.Sgic.DefectTracker.DefectService.repositories.DefectStatusRepository;

@Service
public class DefectStatusServiceImpl implements DefectStatusService {
	@Autowired
	DefectStatusRepository defectStatusRepository;

	@Override
	public DefectStatus createDefectStatus(DefectStatus defectStatus) {

		return defectStatusRepository.save(defectStatus);
	}

	@Override
	public List<DefectStatus> getDefectStatus() {

		return defectStatusRepository.findAll();
	}

	@Override
	public Optional<DefectStatus> getDefectStatusById(Long id) {

		return defectStatusRepository.findById(id);
	}

	@Override
	public void deleteDefectStatus(Long id) {

		defectStatusRepository.deleteById(id);

	}

}
