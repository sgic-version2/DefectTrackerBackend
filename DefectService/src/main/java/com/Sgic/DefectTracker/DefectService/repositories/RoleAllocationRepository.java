package com.Sgic.DefectTracker.DefectService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Sgic.DefectTracker.DefectService.entities.RoleAllocation;

public interface RoleAllocationRepository extends JpaRepository<RoleAllocation, Long> {

}