package com.Sgic.DefectTracker.ProductService.dto;

public class ProductPrivilegeDto {
	private Long PRid;
	private Long privilege_id;
	private String status;

	public Long getPRid() {
		return PRid;
	}

	public void setPRid(Long pRid) {
		PRid = pRid;
	}

	public Long getPrivilege_id() {
		return privilege_id;
	}

	public void setPrivilege_id(Long privilege_id) {
		this.privilege_id = privilege_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
