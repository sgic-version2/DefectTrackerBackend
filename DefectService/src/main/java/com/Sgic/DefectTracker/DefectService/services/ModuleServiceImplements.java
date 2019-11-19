package com.Sgic.DefectTracker.DefectService.services;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.entities.Module;
import com.Sgic.DefectTracker.DefectService.entities.Project;
import com.Sgic.DefectTracker.DefectService.repositories.ModuleRepository;

@Service
public class ModuleServiceImplements  implements ModuleServices{

	
	@Autowired
	ModuleRepository moduleRepository;

	@Override
	public Project createEmployee(Project project) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
