package com.Sgic.DefectTracker.EmployeeService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.EmployeeService.entities.Designation;
import com.Sgic.DefectTracker.EmployeeService.repositories.DesignationRepository;

@Service
public class DesignationServiceImpl implements DesignationService {

	@Autowired
	private DesignationRepository designationRepository;
	
	@Override
	public Designation createDesignation(Designation designation) {
		Designation responseDesignation = designationRepository.save(designation);
		return responseDesignation;
		
	}
	
	@Override
	public List<Designation> getAllDesignation() {
		return designationRepository.findAll();
	}

	@Override
	public Designation updateDesignation(Designation designation, long id) {
		
		return designationRepository.save(designation);
	}

}
