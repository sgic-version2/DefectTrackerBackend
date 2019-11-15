package com.Sgic.DefectTracker.ProductService.entities;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Table( schema="prodect_service",name= "company")
public class CompanyEntity {
	@Id
	private Long id;
	private String company_name;
	private String abbreviation;
	private String reg_no;
	private String admin_name;
	private String admin_email;
	private Long license_type_id;
	private String license_type_name;
	private Date license_period;
	private Date license_start_date;
	private Date license_end_date;
	private String company_description;
	private Long privilege_id;
	

}
