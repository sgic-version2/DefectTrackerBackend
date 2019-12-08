package com.Sgic.DefectTracker.DefectService.dto;

import com.Sgic.DefectTracker.DefectService.entities.Project;

public class ModuleCreateDTO {

	private String module_name;
	private Project project;

	public String getModule_name() {
		return module_name;
	}

	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}
