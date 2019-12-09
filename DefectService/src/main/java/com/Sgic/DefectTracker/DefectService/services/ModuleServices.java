package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;

import com.Sgic.DefectTracker.DefectService.dto.ModuleCreateDTO;
import com.Sgic.DefectTracker.DefectService.dto.ModuleDTO;
import com.Sgic.DefectTracker.DefectService.dto.ModuleUpdateDTO;
import com.Sgic.DefectTracker.DefectService.entities.Module;

public interface ModuleServices {
	
	public List<Object> getModulesById(Long projectId, Long moduleId);
	
	public List<Object> getAllProjects(Long projectId);
	
	public Module createModule(Long projectId, ModuleCreateDTO moduleCreateDTO);
	
	public ModuleDTO updateModule(Long projectId, Long moduleId, ModuleUpdateDTO moduleUpdateDTO);
	
	public void deleteProject(Long projectId, Long moduleId);
}
