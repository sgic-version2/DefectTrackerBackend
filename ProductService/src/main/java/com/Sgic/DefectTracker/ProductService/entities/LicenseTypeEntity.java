package com.Sgic.DefectTracker.ProductService.entities;

<<<<<<< HEAD


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( schema="prodect_service",name= "license_type")
public class LicenseTypeEntity {
private Long id;
private Enum type;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Enum getType() {
	return type;
}
public void setType(Enum type) {
	this.type = type;
}
=======
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;






@Entity
@Table(name="license_type")
public class LicenseTypeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long lid;
	private String lType;
	public Long getLid() {
		return lid;
	}
	public void setLid(Long lid) {
		this.lid = lid;
	}
	public String getlType() {
		return lType;
	}
	public void setlType(String lType) {
		this.lType = lType;
	}
	

>>>>>>> master
}
