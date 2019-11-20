package com.Sgic.DefectTracker.ProductService.dto;

public class CompanyDto {
	private long id;
	private String company_name;
	private String abbreviation;
	private Integer reg_no;
	private String admin_name;
	private String admin_email;
	private long license_type_id;
	private String license_type_name;
	private String license_period;
	private String license_start_date;
	private String license_end_date;
	private String company_description;
	private long privilege_id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public Integer getReg_no() {
		return reg_no;
	}
	public void setReg_no(Integer reg_no) {
		this.reg_no = reg_no;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_email() {
		return admin_email;
	}
	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}
	public long getLicense_type_id() {
		return license_type_id;
	}
	public void setLicense_type_id(long license_type_id) {
		this.license_type_id = license_type_id;
	}
	public String getLicense_type_name() {
		return license_type_name;
	}
	public void setLicense_type_name(String license_type_name) {
		this.license_type_name = license_type_name;
	}
	public String getLicense_period() {
		return license_period;
	}
	public void setLicense_period(String license_period) {
		this.license_period = license_period;
	}
	public String getLicense_start_date() {
		return license_start_date;
	}
	public void setLicense_start_date(String license_start_date) {
		this.license_start_date = license_start_date;
	}
	public String getLicense_end_date() {
		return license_end_date;
	}
	public void setLicense_end_date(String license_end_date) {
		this.license_end_date = license_end_date;
	}
	public String getCompany_description() {
		return company_description;
	}
	public void setCompany_description(String company_description) {
		this.company_description = company_description;
	}
	public long getPrivilege_id() {
		return privilege_id;
	}
	public void setPrivilege_id(long privilege_id) {
		this.privilege_id = privilege_id;
	}
	
	
}


