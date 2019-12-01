package com.Sgic.DefectTracker.DefectService.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "defectentity")
public class DefectEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
		 * 
		 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long defectId;
	private Long projectId;
	private Long assignto;
	private Long assignby;
	private Long attachmentId;

	private Long fixedBy;
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REMOVE })
	@JoinColumn(name = "moduleId")
	private Module module;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REMOVE })
	@JoinColumn(name = "severityId")
	private Severity severity;
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REMOVE })
	@JoinColumn(name = "priorityId")
	private Priority priority;
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REMOVE })
	@JoinColumn(name = "statusId")
	private DefectStatus defectStatus;
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REMOVE })
	@JoinColumn(name = "defectTypeId")
	private DefectType defectType;

	
	private String description;
	private String foundIn;
	private String fixedIn;

	@CreationTimestamp
	private LocalDateTime createdDate;
	@UpdateTimestamp
	private LocalDateTime udatedDate;

	public Severity getSeverity() {
		return severity;
	}

	public void setSeverity(Severity severity) {
		this.severity = severity;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	
	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public DefectStatus getDefectStatus() {
		return defectStatus;
	}

	public void setDefectStatus(DefectStatus defectStatus) {
		this.defectStatus = defectStatus;
	}

	public DefectType getDefectType() {
		return defectType;
	}

	public void setDefectType(DefectType defectType) {
		this.defectType = defectType;
	}

	public Long getDefectId() {
		return defectId;
	}

	public void setDefectId(Long defectId) {
		this.defectId = defectId;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	

	public Long getAssignto() {
		return assignto;
	}

	public void setAssignto(Long assignto) {
		this.assignto = assignto;
	}

	public Long getAssignby() {
		return assignby;
	}

	public void setAssignby(Long assignby) {
		this.assignby = assignby;
	}

	public Long getAttachmentId() {
		return attachmentId;
	}

	public void setAttachmentId(Long attachmentId) {
		this.attachmentId = attachmentId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getFixedBy() {
		return fixedBy;
	}

	public void setFixedBy(Long fixedBy) {
		this.fixedBy = fixedBy;
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

	public LocalDateTime getUdatedDate() {
		return udatedDate;
	}

	public void setUdatedDate(LocalDateTime udatedDate) {
		this.udatedDate = udatedDate;
	}

}