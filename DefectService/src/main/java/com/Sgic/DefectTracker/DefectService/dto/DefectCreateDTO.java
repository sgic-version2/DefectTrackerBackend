package com.Sgic.DefectTracker.DefectService.dto;

import com.Sgic.DefectTracker.DefectService.entities.DefectStatus;
import com.Sgic.DefectTracker.DefectService.entities.DefectType;
import com.Sgic.DefectTracker.DefectService.entities.Module;
import com.Sgic.DefectTracker.DefectService.entities.Priority;
import com.Sgic.DefectTracker.DefectService.entities.Project;
import com.Sgic.DefectTracker.DefectService.entities.Severity;
import com.Sgic.DefectTracker.DefectService.entities.SubModule;

public class DefectCreateDTO {

	private String defectName;
	private String description;
	private String foundIn;
	private String fixedIn;
	private Project project;

	private long assignto;
	private long assignby;

	private Module moduleId;

	private SubModule subModuleId;

	private Severity severityId;

	private Priority priorityId;

	private DefectStatus defectStatusId;

	private DefectType defectTypeId;

	public String getDefectName() {
		return defectName;
	}

	public void setDefectName(String defectName) {
		this.defectName = defectName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFoundIn() {
		return foundIn;
	}

	public void setFoundIn(String foundIn) {
		this.foundIn = foundIn;
	}

	public String getFixedIn() {
		return fixedIn;
	}

	public void setFixedIn(String fixedIn) {
		this.fixedIn = fixedIn;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Module getModuleId() {
		return moduleId;
	}

	public void setModuleId(Module moduleId) {
		this.moduleId = moduleId;
	}

	public long getAssignto() {
		return assignto;
	}

	public void setAssignto(long assignto) {
		this.assignto = assignto;
	}

	public long getAssignby() {
		return assignby;
	}

	public void setAssignby(long assignby) {
		this.assignby = assignby;
	}

	public Severity getSeverityId() {
		return severityId;
	}

	public void setSeverityId(Severity severityId) {
		this.severityId = severityId;
	}

	public Priority getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(Priority priorityId) {
		this.priorityId = priorityId;
	}

	public DefectStatus getDefectStatusId() {
		return defectStatusId;
	}

	public void setDefectStatusId(DefectStatus defectStatusId) {
		this.defectStatusId = defectStatusId;
	}

	public DefectType getDefectTypeId() {
		return defectTypeId;
	}

	public void setDefectTypeId(DefectType defectTypeId) {
		this.defectTypeId = defectTypeId;
	}

	public SubModule getSubModuleId() {
		return subModuleId;
	}

}
