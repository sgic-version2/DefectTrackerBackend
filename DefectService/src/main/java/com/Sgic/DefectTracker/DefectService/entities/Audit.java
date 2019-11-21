package com.Sgic.DefectTracker.DefectService.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "audit")
public class Audit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
		 * 
		 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long auditId;
	private Long defectId;
	private Long userId;
	private Long statusId;
	public Long getAuditId() {
		return auditId;
	}
	public void setAuditId(Long auditId) {
		this.auditId = auditId;
	}
	public Long getDefectId() {
		return defectId;
	}
	public void setDefectId(Long defectId) {
		this.defectId = defectId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getStatusId() {
		return statusId;
	}
	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}
	
	

}
