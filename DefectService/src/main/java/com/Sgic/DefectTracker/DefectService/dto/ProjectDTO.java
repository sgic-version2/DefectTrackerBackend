package com.Sgic.DefectTracker.DefectService.dto;

public class ProjectDTO {
	private long projectId;
	private String project_name;
	private String start_date;
	private String end_date;
	private String status;
	private String project_type;

	public ProjectDTO(long projectId, String project_name, String start_date, String end_date, String status,
			String project_type) {
		this.projectId = projectId;
		this.project_name = project_name;
		this.start_date = start_date;
		this.end_date = end_date;
		this.status = status;
		this.project_type = project_type;
	}

	public long getProjectId() {
		return projectId;
	}

	public String getProject_name() {
		return project_name;
	}

	public String getStart_date() {
		return start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public String getStatus() {
		return status;
	}

	public String getProject_type() {
		return project_type;
	}

}
