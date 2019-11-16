package com.Sgic.DefectTracker.ProductService.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table( schema="prodect_service",name= "privilege_details")
public class PrivilegeDetailsEntity {
private Long id;
private Long role_id;
private Long privilege_id;



}
