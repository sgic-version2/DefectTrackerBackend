package com.Sgic.DefectTracker.DefectService.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.entities.Project;
import com.Sgic.DefectTracker.DefectService.repositories.ProjectRepository;

@Service
public class ProjectServiceImplement  implements ProjectServices{

	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public Project saveProject(Project project) {
		// TODO Auto-generated method stub
		return projectRepository.save(project);
	}

	
	@Override
	public Project updateProject(Project project, long id) {
		// TODO Auto-generated method stub
		return projectRepository.save(project);
	}

	@Override
	public void deleteProject(long id) {
		// TODO Auto-generated method stub
		projectRepository.deleteById(id);
	}
	
	@Override
	public Optional<Project> findByID(long id) {
		// TODO Auto-generated method stub
		return projectRepository.findById(id);
	}


	@Override
	public List<Project> getAllProject() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}

	
	

	}
	
	

	

