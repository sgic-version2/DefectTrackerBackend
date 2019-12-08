package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;

import com.Sgic.DefectTracker.DefectService.dto.ModuleCreateDTO;
import com.Sgic.DefectTracker.DefectService.dto.ProjectDTO;
import com.Sgic.DefectTracker.DefectService.entities.Module;

public interface ModuleServices {
//	public Module saveModule(Module module);
//
//	public Module updateModule(Module module, long id);
//
//	public void deleteModule(long id);
//
//	public List<Module> getAllModule();
//
//	public Optional<Module> findByID(long id);
	
	public List<Object> getModulesById(Long projectId, Long moduleId);
	
	public List<Object> getAllProjects(Long projectId);
	
	public Module createModule(Long projectId, ModuleCreateDTO moduleCreateDTO);
}
