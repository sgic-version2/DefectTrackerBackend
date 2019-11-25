package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.entities.SubModule;
import com.Sgic.DefectTracker.DefectService.repositories.SubModuleRepository;

@Service
public class SubModuleServiceImplement implements SubModuleService {

	@Autowired
	SubModuleRepository subModuleRepository;

	@Override
	public SubModule saveSubModule(SubModule subModule) {
		// TODO Auto-generated method stub
		return subModuleRepository.save(subModule);
	}

	@Override
	public SubModule updateSubModule(SubModule subModule, long id) {
		// TODO Auto-generated method stub
		return subModuleRepository.save(subModule);
	}

	@Override
	public void deleteSubModule(long id) {
		// TODO Auto-generated method stub
		subModuleRepository.deleteById(id);

	}

	@Override
	public List<SubModule> getAllSubModule() {
		// TODO Auto-generated method stub
		return subModuleRepository.findAll();
	}

	@Override
	public Optional<SubModule> findByID(long id) {
		// TODO Auto-generated method stub
		return subModuleRepository.findById(id);
	}

}
