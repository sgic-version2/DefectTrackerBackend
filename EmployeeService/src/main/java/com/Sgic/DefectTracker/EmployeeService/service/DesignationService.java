package com.Sgic.DefectTracker.EmployeeService.service;

import java.util.List;

import com.Sgic.DefectTracker.EmployeeService.entities.Designation;

public interface DesignationService {
	public Designation createDesignation(Designation designation);

	public List<Designation> getAllDesignation();
	
	Designation updateDesignation (Designation designation, long id);
	
	


}
