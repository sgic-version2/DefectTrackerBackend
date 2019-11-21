package com.Sgic.DefectTracker.ProductService.dto;

public class PrivilegeDto {
	private Long Pid;
	private String name;

	public Long getPid() {
		return Pid;
	}

	public void setPid(Long pid) {
		Pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
