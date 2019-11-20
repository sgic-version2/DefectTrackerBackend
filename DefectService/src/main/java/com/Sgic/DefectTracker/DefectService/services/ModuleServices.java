package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import com.Sgic.DefectTracker.DefectService.entities.Module;

public interface ModuleServices {
	Module saveModule(Module module);

	Module updateModule(Module module, long id);

	void deleteModule(long id);

	List<Module> getAllModule();

	Optional<Module> findByID(long id);
}
