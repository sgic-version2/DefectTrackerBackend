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
		return null;
	}

	@Override
	public Module updateModule(Module module, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteModule(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Module> getAllModule() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Module> findByID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
