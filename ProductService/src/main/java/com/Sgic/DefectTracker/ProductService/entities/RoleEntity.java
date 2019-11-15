package com.Sgic.DefectTracker.ProductService.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( schema="prodect_service",name= "role")
public class RoleEntity {
private Long id;
private String role_name;
}
