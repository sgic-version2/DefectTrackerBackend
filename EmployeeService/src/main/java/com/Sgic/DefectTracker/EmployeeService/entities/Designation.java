package com.Sgic.DefectTracker.EmployeeService.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="designation")
public class Designation implements Serializable {
	
	
	private static final long serialVersionUID= 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long designationId;
	private String designationName;
	public long getDesignationId() {
		return designationId;
	}
	public void setDesignationId(long designationId) {
		this.designationId = designationId;
	}
	public String getDesignationName() {
		return designationName;
	}
	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
