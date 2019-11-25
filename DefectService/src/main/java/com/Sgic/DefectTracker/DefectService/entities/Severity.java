package com.Sgic.DefectTracker.DefectService.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "severity")
public class Severity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
		 * 
		 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long serverityId;
	private String name;
	private String value;
	private String color;

	public Long getServerityId() {
		return serverityId;
	}

	public void setServerityId(Long serverityId) {
		this.serverityId = serverityId;
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