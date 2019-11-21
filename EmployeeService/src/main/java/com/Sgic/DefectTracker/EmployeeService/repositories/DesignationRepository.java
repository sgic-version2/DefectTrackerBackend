package com.Sgic.DefectTracker.EmployeeService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sgic.DefectTracker.EmployeeService.entities.Designation;

public interface DesignationRepository extends JpaRepository <Designation, Long> {

}
