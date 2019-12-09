package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;

import com.Sgic.DefectTracker.DefectService.dto.SubModuleCreateDTO;
import com.Sgic.DefectTracker.DefectService.dto.SubModuleDTO;
import com.Sgic.DefectTracker.DefectService.dto.SubModuleUpdateDTO;
import com.Sgic.DefectTracker.DefectService.entities.SubModule;

public interface SubModuleService {

	public List<Object> getSubModulesById(Long moduleId, Long submoduleId);

	public List<Object> getAllModules(Long moduleId);

	public SubModule createSubModule(Long moduleId, SubModuleCreateDTO submoduleCreateDTO);

	public SubModuleDTO updateSubModule(Long moduleId, Long subModuleId, SubModuleUpdateDTO subModuleUpdateDTO);

	public void deleteSubModule(Long moduleId, Long submoduleId);

}
