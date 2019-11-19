package com.Sgic.DefectTracker.DefectService.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
 @Table(schema="", name="module")
public class RolleAllocation implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private long  rolleAllocation_id;
	private String role_name;
	public long getRolleAllocation_id() {
		return rolleAllocation_id;
	}
	public void setRolleAllocation_id(long rolleAllocation_id) {
		this.rolleAllocation_id = rolleAllocation_id;
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
