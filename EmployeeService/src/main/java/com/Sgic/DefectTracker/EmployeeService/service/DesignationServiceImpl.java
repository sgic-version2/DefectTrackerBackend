package com.Sgic.DefectTracker.EmployeeService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.EmployeeService.entities.Designation;
import com.Sgic.DefectTracker.EmployeeService.repositories.DesignationRepository;

@Service
public class DesignationServiceImpl implements DesignationService {

	@Autowired
	private DesignationRepository designationRepository;

	@Override
	public Designation saveDesignation(Designation designation) {
		// TODO Auto-generated method stub
		return designationRepository.save(designation);
	}

	@Override
	public Designation upteDesignation(Designation designation, long id) {
		// TODO Auto-generated method stub
		return designationRepository.save(designation);
	}

	@Override
	public void deleteDesignation(long id) {
		// TODO Auto-generated method stub
		designationRepository.deleteById(id);
	}

	@Override
	public List<Designation> getAllDesignation() {
		// TODO Auto-generated method stub
		return  designationRepository.findAll();
	}

	@Override
	public Optional<Designation> findById(long id) {
		// TODO Auto-generated method stub
		return designationRepository.findById(id);
	}
	
	
}
