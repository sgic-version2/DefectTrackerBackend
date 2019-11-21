package com.Sgic.DefectTracker.ProductService.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="privilegeDetails")
public class PrivilegeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long PDid;
	 
	private Long privileg_id;
	private Long role_id;
	public Long getPDid() {
		return PDid;
	}
	public void setPDid(Long pDid) {
		PDid = pDid;
	}
	public Long getPrivileg_id() {
		return privileg_id;
	}
	public void setPrivileg_id(Long privileg_id) {
		this.privileg_id = privileg_id;
	}
	public Long getRole_id() {
		return role_id;
	}
	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}
	
	
	 

}
