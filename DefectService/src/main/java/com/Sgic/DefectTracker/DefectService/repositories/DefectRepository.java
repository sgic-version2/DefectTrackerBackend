package com.Sgic.DefectTracker.DefectService.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sgic.DefectTracker.DefectService.entities.Defect;

@Repository
public interface DefectRepository extends JpaRepository<Defect, Long>{
	
//	Page<Defect> findByProjectId(Long id, Pageable pageable);
}
