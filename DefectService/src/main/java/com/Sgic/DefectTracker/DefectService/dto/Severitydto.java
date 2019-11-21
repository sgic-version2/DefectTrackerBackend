package com.Sgic.DefectTracker.DefectService.dto;

public class Severitydto {
	private Long severity_id;
	private String name;
	private String value;
	private String color;
	
	
	
	public Long getSeverity_id() {
		return severity_id;
	}
	public void setSeverity_id(Long severity_id) {
		this.severity_id = severity_id;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
