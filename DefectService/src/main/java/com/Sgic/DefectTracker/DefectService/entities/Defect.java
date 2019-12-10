package com.Sgic.DefectTracker.DefectService.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "defect")
public class Defect implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long defectId;

	private String defectName;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "project_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	private Project Project;

//	@ManyToOne(fetch = FetchType.LAZY, optional = false)
//	@JoinColumn(name = "module_id", nullable = false)
//	@OnDelete(action = OnDeleteAction.CASCADE)
//	@JsonIgnore
//	private Module moduleId;
//	
//	private Long assignto;
//	private Long assignby;
//
//	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REMOVE })
//	@JoinColumn(name = "severityId")
//	private Severity severity;
//
//	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REMOVE })
//	@JoinColumn(name = "priorityId")
//	private Priority priority;
//
//	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REMOVE })
//	@JoinColumn(name = "statusId")
//	private DefectStatus defectStatus;
//
//	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REMOVE })
//	@JoinColumn(name = "defectTypeId")
//	private DefectType defectType;

	private String description;

	private String foundIn;
	private String fixedIn;

	@CreationTimestamp
	private LocalDateTime createdDate;

	@UpdateTimestamp
	private LocalDateTime updatedDate;

	public Long getDefectId() {
		return defectId;
	}

	public void setDefectId(Long defectId) {
		this.defectId = defectId;
	}

	public String getDefectName() {
		return defectName;
	}

	public void setDefectName(String defectName) {
		this.defectName = defectName;
	}

	public Project getProject() {
		return Project;
	}

	public void setProject(Project project) {
		Project = project;
	}

//	public Module getModuleId() {
//		return moduleId;
//	}
//
//	public void setModuleId(Module moduleId) {
//		this.moduleId = moduleId;
//	}
//
//	public Long getAssignto() {
//		return assignto;
//	}
//
//	public void setAssignto(Long assignto) {
//		this.assignto = assignto;
//	}
//
//	public Long getAssignby() {
//		return assignby;
//	}
//
//	public void setAssignby(Long assignby) {
//		this.assignby = assignby;
//	}
//
//	public Severity getSeverity() {
//		return severity;
//	}
//
//	public void setSeverity(Severity severity) {
//		this.severity = severity;
//	}
//
//	public Priority getPriority() {
//		return priority;
//	}
//
//	public void setPriority(Priority priority) {
//		this.priority = priority;
//	}
//
//	public DefectStatus getDefectStatus() {
//		return defectStatus;
//	}
//
//	public void setDefectStatus(DefectStatus defectStatus) {
//		this.defectStatus = defectStatus;
//	}
//
//	public DefectType getDefectType() {
//		return defectType;
//	}
//
//	public void setDefectType(DefectType defectType) {
//		this.defectType = defectType;
//	}

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

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

}