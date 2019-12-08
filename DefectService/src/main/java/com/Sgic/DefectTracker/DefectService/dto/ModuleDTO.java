package com.Sgic.DefectTracker.DefectService.dto;

public class ModuleDTO {

	private long module_id;
	private String module_name;
	private long projectId;

	public ModuleDTO(long module_id, String module_name, long projectId) {
		this.module_id = module_id;
		this.module_name = module_name;
		this.projectId = projectId;

	}

	public long getProjectId() {
		return projectId;
	}

	public long getModule_id() {
		return module_id;
	}

	public String getModule_name() {
		return module_name;
	}

}
