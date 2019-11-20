package com.Sgic.DefectTracker.EmployeeService.service;

import java.util.List;
import java.util.Optional;

import com.Sgic.DefectTracker.EmployeeService.entities.Designation;

public interface DesignationService {
	Designation saveDesignation(Designation designation);
	Designation upteDesignation(Designation designation,long id);
	void deleteDesignation (long id);
	List<Designation> getAllDesignation();
	Optional<Designation>findById(long id);
	


}
