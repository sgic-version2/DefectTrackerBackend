package com.Sgic.DefectTracker.EmployeeService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sgic.DefectTracker.EmployeeService.entities.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

	

	

	
//EmployeeEntity findByid(Long employeeId);
}
