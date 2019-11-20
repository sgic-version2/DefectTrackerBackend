package com.Sgic.DefectTracker.ProductService.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="privilegeDetails")
public class PrivilegeDetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long PDid;
	 
	private Long Pid;
	private Long Rid;
	public Long getPDid() {
		return PDid;
	}
	public void setPDid(Long pDid) {
		PDid = pDid;
	}
	public Long getPid() {
		return Pid;
	}
	public void setPid(Long pid) {
		Pid = pid;
	}
	 

}
