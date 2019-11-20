package com.Sgic.DefectTracker.DefectService.services;

import java.awt.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.entities.Project;
import com.Sgic.DefectTracker.DefectService.repositories.ProjectRepository;

@Service
public class ProjectServiceImplement  implements ProjectServices{

	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public Project createEmployee(Project project) {
		// TODO Auto-generated method stub
		return null;
	}


	}
	
	

	

