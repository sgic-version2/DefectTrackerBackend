package com.Sgic.DefectTracker.ProductService.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table( schema="prodect_service",name= "privilege")
public class Privilege {
private Long id;
private String name;
}
