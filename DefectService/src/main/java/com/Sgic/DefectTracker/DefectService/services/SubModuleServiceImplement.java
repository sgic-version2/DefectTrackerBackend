package com.Sgic.DefectTracker.DefectService.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.dto.SubModuleCreateDTO;
import com.Sgic.DefectTracker.DefectService.dto.SubModuleDTO;
import com.Sgic.DefectTracker.DefectService.dto.SubModuleUpdateDTO;
import com.Sgic.DefectTracker.DefectService.entities.Module;
import com.Sgic.DefectTracker.DefectService.entities.SubModule;
import com.Sgic.DefectTracker.DefectService.repositories.ModuleRepository;
import com.Sgic.DefectTracker.DefectService.repositories.SubModuleRepository;

@Service
public class SubModuleServiceImplement implements SubModuleService {

	@Autowired
	SubModuleRepository subModuleRepository;

	@Autowired
	ModuleRepository moduleRepository;

//	@Override
//	public SubModule saveSubModule(SubModule subModule) {
//		// TODO Auto-generated method stub
//		return subModuleRepository.save(subModule);
//	}
//
//	@Override
//	public SubModule updateSubModule(SubModule subModule, long id) {
//		// TODO Auto-generated method stub
//		return subModuleRepository.save(subModule);
//	}
//
//	@Override
//	public void deleteSubModule(long id) {
//		// TODO Auto-generated method stub
//		subModuleRepository.deleteById(id);
//
//	}
//
//	@Override
//	public List<SubModule> getAllSubModule() {
//		// TODO Auto-generated method stub
//		return subModuleRepository.findAll();
//	}
//
//	@Override
//	public Optional<SubModule> findByID(long id) {
//		// TODO Auto-generated method stub
//		return subModuleRepository.findById(id);
//	}
	public SubModule createSubModule(Long moduleId, SubModuleCreateDTO submoduleCreateDTO) {
		Optional<Module> moduleEntity = moduleRepository.findById(moduleId);
		SubModule newSubModule = new SubModule();

		if (moduleEntity.isPresent()) {
			newSubModule.setSubmodule_name(submoduleCreateDTO.getSubmodule_name());
			newSubModule.setModule(moduleEntity.get());
			return subModuleRepository.save(newSubModule);
		}
		return null;
	}

	public List<Object> getAllModules(Long moduleId) {
		List<Object> submoduleList = new ArrayList<>();
		subModuleRepository.findAll().forEach(subModule -> {
			if (subModule.getModule().getModule_id() == moduleId) {
				submoduleList.add(new SubModuleDTO(subModule.getSubmodule_id(), subModule.getSubmodule_name(),
						subModule.getModule().getModule_id()));
			}
		});
		return submoduleList;
	}

	public List<Object> getSubModulesById(Long moduleId, Long submoduleId) {
		List<Object> subModuleList = new ArrayList<Object>();

		subModuleRepository.findAll().forEach(response -> {
			if ((response.getSubmodule_id() == submoduleId) && (response.getModule().getModule_id() == moduleId)) {
				subModuleList.add(new SubModuleDTO(response.getSubmodule_id(), response.getSubmodule_name(),
						response.getModule().getModule_id()));
			}
		});
		return subModuleList;
	}

	public SubModuleDTO updateSubModule(Long moduleId, Long subModuleId, SubModuleUpdateDTO subModuleUpdateDTO) {
		Optional<Module> moduleEntity = moduleRepository.findById(moduleId);

		SubModule existingSubModule = subModuleRepository.findById(subModuleId).get();

		if (moduleEntity.isPresent()) {
			if (existingSubModule.getSubmodule_id() == subModuleId) {

				existingSubModule.setSubmodule_name(subModuleUpdateDTO.getSubmodule_name());

				SubModule updatedSubModule = subModuleRepository.save(existingSubModule);

				return new SubModuleDTO(updatedSubModule.getSubmodule_id(), updatedSubModule.getSubmodule_name(),
						updatedSubModule.getModule().getModule_id());
			}
		}
		return null;
	}

	public void deleteSubModule(Long moduleId, Long subModuleId) {
		Optional<Module> subModule = moduleRepository.findById(moduleId);

		if (subModule.isPresent()) {
			subModuleRepository.deleteById(subModuleId);
		}
	}
}
