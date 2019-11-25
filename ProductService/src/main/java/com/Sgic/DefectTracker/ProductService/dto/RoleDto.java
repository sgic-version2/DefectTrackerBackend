package com.Sgic.DefectTracker.ProductService.dto;

public class RoleDto {
	private Long Rid;
	private String role_name;
	public Long getRid() {
		return Rid;
	}
	public void setRid(Long rid) {
		Rid = rid;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	
}
