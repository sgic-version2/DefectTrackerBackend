package com.Sgic.DefectTracker.ProductService.entities;



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
}
