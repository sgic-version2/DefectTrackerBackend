package com.Sgic.DefectTracker.DefectService.dto;

import com.Sgic.DefectTracker.DefectService.entities.Module;

public class SubModuleCreateDTO {

	private String submodule_name;
	private Module module;

	public String getSubmodule_name() {
		return submodule_name;
	}

	public void setSubmodule_name(String submodule_name) {
		this.submodule_name = submodule_name;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

}
