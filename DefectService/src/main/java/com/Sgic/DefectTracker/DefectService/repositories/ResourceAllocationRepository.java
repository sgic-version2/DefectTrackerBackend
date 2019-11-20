package com.Sgic.DefectTracker.DefectService.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Sgic.DefectTracker.DefectService.entities.ResourceAllocation;

public interface ResourceAllocationRepository extends JpaRepository<ResourceAllocation, Long>   {

}
