package com.Sgic.DefectTracker.LoginService.entities;

@Entity
@Table(name="employee")
public class User {
	
	@Id
	
	private String userId;
	private String userName;
	private String email;
	private String phoneNumber;
	private String password;
	private String token;
	private String forgetPasswordCode;
	
	
	
	

}













public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeId;
	private String firstname;
	private String lastname;
	private String email;
	private Integer phone;
	private String country;
	private String username;
	private String password;
//	
//	@OneToOne
//	@JoinColumn(name="designation_id")
//	private Designation designation;
//	
	

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REMOVE })
	@JoinColumn(name="designationId",nullable=false)
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Designation designation;

	public Designation getDesignation() {
		return designation;
	}
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
//	@OneToOne
//	@JoinColumn(name="designationId")
//	private Designation designation;

	
	
//	public Designation getDesignation() {
//		return designation;
//	}
//	public void setDesignation(Designation designation) {
//		this.designation = designation;
//	}
//	
	
	
	
	
	
}
