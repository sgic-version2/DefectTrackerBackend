package com.Sgic.DefectTracker.DefectService.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.dto.ProjectCreateDTO;
import com.Sgic.DefectTracker.DefectService.dto.ProjectDTO;
import com.Sgic.DefectTracker.DefectService.dto.ProjectUpdateDTO;
import com.Sgic.DefectTracker.DefectService.entities.Project;
import com.Sgic.DefectTracker.DefectService.repositories.ProjectRepository;

@Service
public class ProjectServiceImplement implements ProjectServices {

	@Autowired
	private ProjectRepository projectRepository;

//	@Override
//	public Project saveProject(Project project) {
//		// TODO Auto-generated method stub
//		return projectRepository.save(project);
//	}
//
//	
//	@Override
//	public Project updateProject(Project project, long id) {
//		// TODO Auto-generated method stub
//		return projectRepository.save(project);
//	}
//
//	@Override
//	public void deleteProject(long id) {
//		// TODO Auto-generated method stub
//		projectRepository.deleteById(id);
//	}
//	
//	@Override
//	public Optional<Project> findByID(long id) {
//		// TODO Auto-generated method stub
//		return projectRepository.findById(id);
//	}
//
//
//	@Override
//	public List<Project> getAllProject() {
//		// TODO Auto-generated method stub
//		return projectRepository.findAll();
//	}

	public ProjectDTO getProjectById(Long id) {
		if (projectRepository.findById(id).isPresent()) {
			Project fetchProject = projectRepository.findById(id).get();
			return new ProjectDTO(fetchProject.getProjectId(), fetchProject.getProject_name(),
					fetchProject.getStart_date(), fetchProject.getEnd_date(), fetchProject.getStatus(),
					fetchProject.getProject_type());
		} else {
			return null;
		}
	}

	public List<Object> getAllProjects() {
		List<Object> projectList = new ArrayList<>();
		projectRepository.findAll().forEach(project -> {
			projectList.add(new ProjectDTO(project.getProjectId(), project.getProject_name(),
					project.getStart_date(), project.getEnd_date(), project.getStatus(), project.getProject_type()));
		});

		return projectList;
	}

	public Long createProject(ProjectCreateDTO projectCreateDTO) {
		Project newProject = new Project();
		newProject.setProject_name(projectCreateDTO.getProject_name());
		newProject.setStart_date(projectCreateDTO.getStart_date());
		newProject.setEnd_date(projectCreateDTO.getEnd_date());
		newProject.setStatus(projectCreateDTO.getStatus());
		newProject.setProject_type(projectCreateDTO.getProject_type());

		return projectRepository.save(newProject).getProjectId();
	}

	public ProjectDTO updateProject(Long id, ProjectUpdateDTO projectUpdateDTO) {
		if (projectRepository.findById(id).isPresent()) {
			Project existingProject = projectRepository.findById(id).get();

			existingProject.setProject_name(projectUpdateDTO.getProject_name());
			existingProject.setEnd_date(projectUpdateDTO.getEnd_date());
			existingProject.setStatus(projectUpdateDTO.getStatus());
			existingProject.setProject_type(projectUpdateDTO.getProject_type());

			Project updatedProject = projectRepository.save(existingProject);

			return new ProjectDTO(updatedProject.getProjectId(), updatedProject.getProject_name(),
					updatedProject.getStart_date(), updatedProject.getEnd_date(), updatedProject.getStatus(),
					updatedProject.getProject_type());
		} else {
			return null;
		}
	}

	public void deleteProject(Long id) {
		if (projectRepository.findById(id).isPresent()) {
			projectRepository.deleteById(id);
		}
	}

}
