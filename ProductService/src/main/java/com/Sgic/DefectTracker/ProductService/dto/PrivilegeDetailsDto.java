package com.Sgic.DefectTracker.ProductService.dto;

public class PrivilegeDetailsDto {
	private Long PDid;
	 
	private Long Pid;
	private Long Rid;
	public Long getPDid() {
		return PDid;
	}
	public void setPDid(Long pDid) {
		PDid = pDid;
	}
	public Long getPid() {
		return Pid;
	}
	public void setPid(Long pid) {
		Pid = pid;
	}
	public Long getRid() {
		return Rid;
	}
	public void setRid(Long rid) {
		Rid = rid;
	}
}
