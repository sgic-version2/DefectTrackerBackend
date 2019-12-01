package com.Sgic.DefectTracker.DefectService.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roleAllocation")
public class RoleAllocation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
		 * 
		 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long RoleAllocationId;
	private Long roleId;
	private Long resourceId;
	public Long getRoleAllocationId() {
		return RoleAllocationId;
	}
	public void setRoleAllocationId(Long roleAllocationId) {
		RoleAllocationId = roleAllocationId;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Long getResourceId() {
		return resourceId;
	}
	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}
	
}