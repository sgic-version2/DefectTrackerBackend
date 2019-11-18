package com.Sgic.DefectTracker.ProductService.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( schema="prodect_service",name= "role")
public class Role  implements Serializable{
	private static final long serialVersionUID = 1L;
private Long id;
private String role_name;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getRole_name() {
	return role_name;
}
public void setRole_name(String role_name) {
	this.role_name = role_name;
}

}
