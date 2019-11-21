package com.Sgic.DefectTracker.ProductService.dto;

public class PrivilegeDetailsDto {
	private Long PDid;
	 
	private Long privilege_id;
	private Long role_id;
	public Long getPDid() {
		return PDid;
	}
	public void setPDid(Long pDid) {
		PDid = pDid;
	}
	public Long getPrivilege_id() {
		return privilege_id;
	}
	public void setPrivilege_id(Long privilege_id) {
		this.privilege_id = privilege_id;
	}
	public Long getRole_id() {
		return role_id;
	}
	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}
	
}
