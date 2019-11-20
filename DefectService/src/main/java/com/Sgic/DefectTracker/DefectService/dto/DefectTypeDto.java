package com.Sgic.DefectTracker.DefectService.dto;

public class DefectTypeDto {
	private Long typeId;
	private String name;
	private String value;
	
	public Long getTypeId() {
		return typeId;
	}
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
