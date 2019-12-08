package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.Exception.ResourceNotFoundException;
import com.Sgic.DefectTracker.DefectService.entities.Defect;
import com.Sgic.DefectTracker.DefectService.entities.Project;
import com.Sgic.DefectTracker.DefectService.repositories.DefectRepository;
import com.Sgic.DefectTracker.DefectService.repositories.ProjectRepository;

@Service
public class DefectServiceImpl implements DefectService {
	@Autowired
	DefectRepository defectRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Override
	public Defect createDefectEntity(Defect defectEntity) {
		return defectRepository.save(defectEntity);
	}

	@Override
	public List<Defect> getDefectEntity() {
		return defectRepository.findAll();
	}

	@Override
	public Optional<Defect> getDefectEntityById(Long id) {
		return defectRepository.findById(id);
	}

	@Override
	public void deleteDefectEntity(Long id) {
		defectRepository.deleteById(id);

	}

	@Override
	public Defect addDefectToProject(Long projectId, Defect defect) {
		return projectRepository.findById(projectId).map(postRequest -> {
			defect.setProject(postRequest);
			return defectRepository.save(defect);
		}).orElseThrow(() -> new ResourceNotFoundException("projectId " + projectId + " not found"));
	}

}
