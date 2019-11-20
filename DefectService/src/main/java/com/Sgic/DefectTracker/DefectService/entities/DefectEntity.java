package com.Sgic.DefectTracker.DefectService.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.*;

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
	private Long moduleId;
	private Long assignto;
	private Long assignby;
	private Long severityId;
	private Long priorityId;
	private Long statusId;
	private Long defecttypeId;
	private Long attachmentId;
	private String description;

	private Long fixedBy;
	private String foundIn;
	private String fixedIn;
	
	@CreationTimestamp
	private LocalDateTime createdDate;
	@UpdateTimestamp
	private LocalDateTime udatedDate;
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
	public Long getModuleId() {
		return moduleId;
	}
	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
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
	public Long getSeverityId() {
		return severityId;
	}
	public void setSeverityId(Long severityId) {
		this.severityId = severityId;
	}
	public Long getPriorityId() {
		return priorityId;
	}
	public void setPriorityId(Long priorityId) {
		this.priorityId = priorityId;
	}
	public Long getStatusId() {
		return statusId;
	}
	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}
	public Long getDefecttypeId() {
		return defecttypeId;
	}
	public void setDefecttypeId(Long defecttypeId) {
		this.defecttypeId = defecttypeId;
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