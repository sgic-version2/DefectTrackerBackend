package com.Sgic.DefectTracker.ProductService.entities;



import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( schema="prodect_service",name= "license_type")
public class LicenseTypeEntity {
private Long id;
private Enum type;
}
