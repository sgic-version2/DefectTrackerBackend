package com.Sgic.DefectTracker.DefectService.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(schema="", name="module")
public class Module implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long module_id;
	private  String module_name;
	public long getModule_id() {
		return module_id;
	}
	public void setModule_id(long module_id) {
		this.module_id = module_id;
	}
	public String getModule_name() {
		return module_name;
	}
	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	 
	
	
	
	

}
