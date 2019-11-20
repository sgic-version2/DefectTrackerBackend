package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import com.Sgic.DefectTracker.DefectService.entities.SubModule;

public interface SubModuleService {

	SubModule saveSubModule(SubModule subModule);

	SubModule updateSubModule(SubModule module, long id);

	void deleteSubModule(long id);

	List<SubModule> getAllSubModule();

	Optional<SubModule> findByID(long id);

}
