package com.Sgic.DefectTracker.ProductService.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( schema="prodect_service",name= "product_privilege")
public class ProductPrivilegeEntity {
private Long id;
private Long privilege_id;
private Enum status;
}
