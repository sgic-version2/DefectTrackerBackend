package com.Sgic.DefectTracker.DefectService.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.dto.ModuleCreateDTO;
import com.Sgic.DefectTracker.DefectService.dto.ModuleDTO;
import com.Sgic.DefectTracker.DefectService.dto.ModuleUpdateDTO;
import com.Sgic.DefectTracker.DefectService.entities.Module;
import com.Sgic.DefectTracker.DefectService.entities.Project;
import com.Sgic.DefectTracker.DefectService.repositories.ModuleRepository;
import com.Sgic.DefectTracker.DefectService.repositories.ProjectRepository;

@Service
public class ModuleServiceImplements implements ModuleServices {

	@Autowired
	ModuleRepository moduleRepository;

	@Autowired
	ProjectRepository projectRepository;

	public List<Object> getModulesById(Long projectId, Long moduleId) {
		List<Object> moduleList = new ArrayList<>();
		moduleRepository.findAll().forEach(module -> {
			if ((module.getModule_id() == moduleId) && module.getProject().getProjectId() == projectId) {
				moduleList.add(new ModuleDTO(module.getModule_id(), module.getModule_name(),
						module.getProject().getProjectId()));
			}
		});
		return moduleList;
	}

	public List<Object> getAllProjects(Long projectId) {
		List<Object> moduleList = new ArrayList<>();
		moduleRepository.findAll().forEach(module -> {
			if (module.getProject().getProjectId() == projectId) {
				moduleList.add(new ModuleDTO(module.getModule_id(), module.getModule_name(),
						module.getProject().getProjectId()));
			}
		});
		return moduleList;
	}

	public Module createModule(Long projectId, ModuleCreateDTO moduleCreateDTO) {
		Optional<Project> projectEntity = projectRepository.findById(projectId);
		Module newModule = new Module();

		if (projectEntity.isPresent()) {
			newModule.setModule_name(moduleCreateDTO.getModule_name());
			newModule.setProject(projectEntity.get());
			return moduleRepository.save(newModule);
		}
		return null;
	}

	public ModuleDTO updateModule(Long projectId, Long moduleId, ModuleUpdateDTO moduleUpdateDTO) {
		Optional<Project> project = projectRepository.findById(projectId);

		Module existingModule = moduleRepository.findById(moduleId).get();

		if (project.isPresent()) {
			if (existingModule.getProject().getProjectId() == projectId) {
				existingModule.setModule_name(moduleUpdateDTO.getModule_name());

				Module updatedModule = moduleRepository.save(existingModule);

				return new ModuleDTO(updatedModule.getModule_id(), updatedModule.getModule_name(),
						updatedModule.getProject().getProjectId());
			}
		}

		return null;

	}

	public void deleteProject(Long projetcId, Long moduleId) {
		Optional<Project> project = projectRepository.findById(projetcId);

		if (project.isPresent()) {
			moduleRepository.deleteById(moduleId);
		}
	}
}
