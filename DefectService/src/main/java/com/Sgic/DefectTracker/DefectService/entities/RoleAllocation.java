package com.Sgic.DefectTracker.DefectService.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(schema="", name="roleAllocation")
public class RoleAllocation implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long roleAllocation_id;
	private String role_name;
	
	
	public long getRoleAllocation_id() {
		return roleAllocation_id;
	}
	public void setRoleAllocation_id(long roleAllocation_id) {
		this.roleAllocation_id = roleAllocation_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
