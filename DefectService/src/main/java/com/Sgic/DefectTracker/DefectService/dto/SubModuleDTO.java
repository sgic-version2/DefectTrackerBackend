package com.Sgic.DefectTracker.DefectService.dto;

public class SubModuleDTO {

	private long submodule_id;
	private String submodule_name;
	private long moduleId;

	public SubModuleDTO(long submoduleId, String submoduleName, long moduleId) {
		this.submodule_id = submoduleId;
		this.submodule_name = submoduleName;
		this.moduleId = moduleId;
	}

	public long getSubmodule_id() {
		return submodule_id;
	}

	public String getSubmodule_name() {
		return submodule_name;
	}

	public long getModuleId() {
		return moduleId;
	}

}
