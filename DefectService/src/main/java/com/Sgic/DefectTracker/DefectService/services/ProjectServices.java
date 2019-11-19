package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import com.Sgic.DefectTracker.DefectService.entities.Project;

public interface ProjectServices {

	Project saveProject(Project project);

	Project updateProject(Project project, long id);

	void deleteProject(long id);

	List<Project> getAllProject();

	Optional<Project> findByID(long id);

}
