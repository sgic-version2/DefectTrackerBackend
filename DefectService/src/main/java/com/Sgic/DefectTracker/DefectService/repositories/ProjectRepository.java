package com.Sgic.DefectTracker.DefectService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sgic.DefectTracker.DefectService.entities.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

	// Project findByProjectId(Long id);
	
	
	
	
	
	
	
	
	
}
