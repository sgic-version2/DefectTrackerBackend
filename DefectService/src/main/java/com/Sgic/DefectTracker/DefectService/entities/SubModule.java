package com.Sgic.DefectTracker.DefectService.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="")
public class SubModule implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long submodule_id;
	private String submodule_name;
	public long getSubmodule_id() {
		return submodule_id;
	}
	public void setSubmodule_id(long submodule_id) {
		this.submodule_id = submodule_id;
	}
	public String getSubmodule_name() {
		return submodule_name;
	}
	public void setSubmodule_name(String submodule_name) {
		this.submodule_name = submodule_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
