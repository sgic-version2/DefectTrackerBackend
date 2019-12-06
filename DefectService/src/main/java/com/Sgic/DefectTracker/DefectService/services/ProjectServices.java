package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.dto.ProjectCreateDTO;
import com.Sgic.DefectTracker.DefectService.dto.ProjectQueryDTO;
import com.Sgic.DefectTracker.DefectService.dto.ProjectUpdateDTO;

@Service
public interface ProjectServices {

//	Project saveProject(Project project);
//
//	Project updateProject(Project project, long id);
//
//	void deleteProject(long id);
//
//	List<Project> getAllProject();
//
//	Optional<Project> findByID(long id);

	public ProjectQueryDTO getProjectById(Long id);

	public List<Object> getAllProjects();

	public Long createProject(ProjectCreateDTO projectCreateDTO);

	public ProjectQueryDTO updateProject(Long id, ProjectUpdateDTO projectUpdateDTO);

	public void deleteProject(Long id);
}
