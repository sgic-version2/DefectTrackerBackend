package com.Sgic.DefectTracker.ProductService.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name= "privilege")
public class Privilege implements Serializable {
	
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

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
