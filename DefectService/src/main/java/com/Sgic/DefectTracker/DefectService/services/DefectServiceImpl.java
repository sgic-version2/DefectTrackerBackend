package com.Sgic.DefectTracker.DefectService.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.dto.DefectCreateDTO;
import com.Sgic.DefectTracker.DefectService.dto.DefectDTO;
import com.Sgic.DefectTracker.DefectService.dto.DefectUpdateDTO;
import com.Sgic.DefectTracker.DefectService.entities.Defect;
import com.Sgic.DefectTracker.DefectService.entities.Module;
import com.Sgic.DefectTracker.DefectService.entities.Project;
import com.Sgic.DefectTracker.DefectService.entities.SubModule;
import com.Sgic.DefectTracker.DefectService.repositories.DefectRepository;
import com.Sgic.DefectTracker.DefectService.repositories.DefectStatusRepository;
import com.Sgic.DefectTracker.DefectService.repositories.DefectTypeRepository;
import com.Sgic.DefectTracker.DefectService.repositories.ModuleRepository;
import com.Sgic.DefectTracker.DefectService.repositories.PriorityRepository;
import com.Sgic.DefectTracker.DefectService.repositories.ProjectRepository;
import com.Sgic.DefectTracker.DefectService.repositories.SeverityRepository;
import com.Sgic.DefectTracker.DefectService.repositories.SubModuleRepository;

@Service
public class DefectServiceImpl implements DefectService {
	@Autowired
	DefectRepository defectRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Autowired
	ModuleRepository moduleRepository;

	@Autowired
	SeverityRepository severityRepository;

	@Autowired
	PriorityRepository priorityRepository;

	@Autowired
	DefectStatusRepository defectStatusRepository;

	@Autowired
	DefectTypeRepository defectTypeRepository;

	@Autowired
	SubModuleRepository subModuleRepository;

	@Override
	public Optional<Defect> getDefectEntityById(Long id) {
		return defectRepository.findById(id);
	}

	public Defect createDefect(Long projectId, Long moduleId, Long subModuleId, DefectCreateDTO defectCreateDTO) {
		Optional<Project> projectEntity = projectRepository.findById(projectId);

		Optional<Module> moduleEntity = moduleRepository.findById(moduleId);

		Optional<SubModule> subModuleEntity = subModuleRepository.findById(subModuleId);

		Defect newDefect = new Defect();

		if ((projectEntity.isPresent()) && (moduleEntity.isPresent()) && (subModuleEntity.isPresent())) {

			newDefect.setDefectName(defectCreateDTO.getDefectName());
			newDefect.setDescription(defectCreateDTO.getDescription());
			newDefect.setFoundIn(defectCreateDTO.getFoundIn());
			newDefect.setFixedIn(defectCreateDTO.getFixedIn());
			newDefect.setAssignto(defectCreateDTO.getAssignto());
			newDefect.setAssignby(defectCreateDTO.getAssignby());
			newDefect.setProject(projectEntity.get());
			newDefect.setModuleId(moduleEntity.get());
			newDefect.setSubModule(subModuleEntity.get());
			newDefect.setSeverity(defectCreateDTO.getSeverityId());
			newDefect.setPriority(defectCreateDTO.getPriorityId());
			newDefect.setDefectStatus(defectCreateDTO.getDefectStatusId());
			newDefect.setDefectType(defectCreateDTO.getDefectTypeId());

			return defectRepository.save(newDefect);
		}
		return null;
	}

	public List<Object> getAllDefects(Long projectId) {
		List<Object> defectList = new ArrayList<>();

		defectRepository.findAll().forEach(defect -> {
			if (defect.getProject().getProjectId() == projectId) {
				defectList.add(
						new DefectDTO(defect.getDefectId(), defect.getDefectName(), defect.getProject().getProjectId(),
//						defect.getModuleId().getModule_id(), defect.getAssignto(),
//						defect.getAssignby(), defect.getSeverity().getServerityId(),
//						defect.getPriority().getPriorityId(), defect.getDefectStatus().getStatusId(),
//						defect.getDefectType().getTypeId(),
								defect.getDescription(), defect.getFoundIn(), defect.getFixedIn(),
								defect.getCreatedDate(), defect.getUpdatedDate()));
			}
		});

		return defectList;
	}

	public List<Object> getDefectsById(Long projectId, Long moduleId, Long subModuleId, Long defectId) {
		List<Object> defectList = new ArrayList<>();

		defectRepository.findAll().forEach(defect -> {
			if ((defect.getProject().getProjectId() == projectId) && (defect.getDefectId() == defectId)
					&& (defect.getSubModule().getSubmodule_id() == subModuleId)
					&& (defect.getModuleId().getModule_id() == moduleId)) {
				defectList.add(
						new DefectDTO(defect.getDefectId(), defect.getDefectName(), defect.getProject().getProjectId(),
//								defect.getModuleId().getModule_id(), defect.getSubModule().getSubmodule_id(),
//								defect.getAssignto(), defect.getAssignby(), defect.getSeverity().getServerityId(),
//								defect.getPriority().getPriorityId(), defect.getDefectStatus().getStatusId(),
//								defect.getDefectType().getTypeId(), 
								defect.getDescription(), defect.getFoundIn(), defect.getFixedIn(),
								defect.getCreatedDate(), defect.getUpdatedDate()));
			}
		});
		return defectList;
	}

	public List<Object> getDefectFromSubModule(Long projectId, Long moduleId, Long subModuleId) {
		List<Object> defectList = new ArrayList<>();

		defectRepository.findAll().forEach(defect -> {
			if ((defect.getProject().getProjectId() == projectId) && (defect.getModuleId().getModule_id() == moduleId)
					&& (defect.getSubModule().getSubmodule_id() == subModuleId)) {
				defectList.add(
						new DefectDTO(defect.getDefectId(), defect.getDefectName(), defect.getProject().getProjectId(),
//						defect.getModuleId().getModule_id(), defect.getAssignto(),
//						defect.getAssignby(), defect.getSeverity().getServerityId(),
//						defect.getPriority().getPriorityId(), defect.getDefectStatus().getStatusId(),
//						defect.getDefectType().getTypeId(),
								defect.getDescription(), defect.getFoundIn(), defect.getFixedIn(),
								defect.getCreatedDate(), defect.getUpdatedDate()));
			}
		});

		return defectList;
	}

	public DefectDTO updateDefect(Long projectId, Long moduleId, Long subModuleId, Long defectId,
			DefectUpdateDTO defectUpdateDTO) {

		Optional<Project> projectEntity = projectRepository.findById(projectId);

		Optional<Module> moduleEntity = moduleRepository.findById(moduleId);

		Optional<SubModule> subModuleEntity = subModuleRepository.findById(subModuleId);

		Defect existingDefect = defectRepository.findById(defectId).get();

		if ((projectEntity.isPresent()) && (moduleEntity.isPresent()) && (subModuleEntity.isPresent())) {

			existingDefect.setDefectName(defectUpdateDTO.getDefectName());
			existingDefect.setDescription(defectUpdateDTO.getDescription());
			existingDefect.setFixedIn(defectUpdateDTO.getFixedIn());

			Defect updatedDefect = defectRepository.save(existingDefect);

			return new DefectDTO(updatedDefect.getDefectId(), updatedDefect.getDefectName(),
					updatedDefect.getProject().getProjectId(),
//						defect.getModuleId().getModule_id(), defect.getAssignto(),
//						defect.getAssignby(), defect.getSeverity().getServerityId(),
//						defect.getPriority().getPriorityId(), defect.getDefectStatus().getStatusId(),
//						defect.getDefectType().getTypeId(),
					updatedDefect.getDescription(), updatedDefect.getFoundIn(), updatedDefect.getFixedIn(),
					updatedDefect.getCreatedDate(), updatedDefect.getUpdatedDate());
		}

		return null;

	}

	public void deleteDefect(Long projectId, Long moduleId, Long subModuleId, Long defectId) {
		Optional<Project> projectEntity = projectRepository.findById(projectId);

		Optional<Module> moduleEntity = moduleRepository.findById(moduleId);

		Optional<SubModule> subModuleEntity = subModuleRepository.findById(subModuleId);

		if ((projectEntity.isPresent()) && (moduleEntity.isPresent()) && (subModuleEntity.isPresent())) {
			defectRepository.deleteById(defectId);
		}
	}

}
