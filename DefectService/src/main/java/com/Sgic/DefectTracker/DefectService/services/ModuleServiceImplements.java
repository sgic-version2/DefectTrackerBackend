package com.Sgic.DefectTracker.DefectService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.Sgic.DefectTracker.DefectService.entities.Module;
import com.Sgic.DefectTracker.DefectService.repositories.ModuleRepository;

@Service
public class ModuleServiceImplements implements ModuleServices {

	@Autowired
	ModuleRepository moduleRepository;

	@Override
	public Module saveModule(Module module) {
		// TODO Auto-generated method stub
		return moduleRepository.save(module);
	}

	@Override
	public Module updateModule(Module module, long id) {
		// TODO Auto-generated method stub
		return moduleRepository.save(module);
	}

	@Override
	public void deleteModule(long id) {
		moduleRepository.deleteById(id);

	}

	@Override
	public List<Module> getAllModule() {
		// TODO Auto-generated method stub
		return moduleRepository.findAll();
	}

	@Override
	public Optional<Module> findByID(long id) {
		// TODO Auto-generated method stub
		return moduleRepository.findById(id);
	}

}
