package com.Sgic.DefectTracker.DefectService.entities;




import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "resourceAllocation")
public class ResourceAllocation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
		 * 
		 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long resourceId;
	private Long employeeId;
	private Long prijectId;
	
	
	
	public Long getResourceId() {
		return resourceId;
	}
	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public Long getPrijectId() {
		return prijectId;
	}
	public void setPrijectId(Long prijectId) {
		this.prijectId = prijectId;
	}
	

	

}