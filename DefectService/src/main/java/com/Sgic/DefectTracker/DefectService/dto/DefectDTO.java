package com.Sgic.DefectTracker.DefectService.dto;

import java.time.LocalDateTime;

public class DefectDTO {

	private long defectId;

	private String defectName;

	private long ProjectId;

//	private long moduleId;
//
//	private long assignto;
//
//	private long assignby;
//
//	private long severityId;
//
//	private long priorityId;
//
//	private long defectStatusId;
//
//	private long defectTypeId;

	private String description;

	private String foundIn;

	private String fixedIn;

	private LocalDateTime createdDate;

	private LocalDateTime updatedDate;

	public DefectDTO(long defectId, String defectName, long ProjectId, long moduleId, long assignto, long assignby,
			long severityId, long priorityId, long defectStatusId, long defectTypeId, String description,
			String foundIn, String fixedIn, LocalDateTime createdDate, LocalDateTime updatedDate) {

		this.defectId = defectId;
		this.defectName = defectName;
		this.ProjectId = ProjectId;
//		this.moduleId = moduleId;
//		this.assignto = assignto;
//		this.assignby = assignby;
//		this.severityId = severityId;
//		this.priorityId = priorityId;
//		this.defectStatusId = defectStatusId;
//		this.defectTypeId = defectTypeId;
		this.description = description;
		this.foundIn = foundIn;
		this.fixedIn = fixedIn;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public DefectDTO(long defectId, String defectName, long ProjectId, String description, String foundIn,
			String fixedIn, LocalDateTime createdDate, LocalDateTime updatedDate) {

		this.defectId = defectId;
		this.defectName = defectName;
		this.ProjectId = ProjectId;
		this.description = description;
		this.foundIn = foundIn;
		this.fixedIn = fixedIn;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public long getDefectId() {
		return defectId;
	}

	public String getDefectName() {
		return defectName;
	}

	public long getProjectId() {
		return ProjectId;
	}

//	public long getModuleId() {
//		return moduleId;
//	}
//
//	public long getAssignto() {
//		return assignto;
//	}
//
//	public long getAssignby() {
//		return assignby;
//	}
//
//	public long getSeverityId() {
//		return severityId;
//	}
//
//	public long getPriorityId() {
//		return priorityId;
//	}
//
//	public long getDefectStatusId() {
//		return defectStatusId;
//	}
//
//	public long getDefectTypeId() {
//		return defectTypeId;
//	}

	public String getDescription() {
		return description;
	}

	public String getFoundIn() {
		return foundIn;
	}

	public String getFixedIn() {
		return fixedIn;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

}
