package com.Sgic.DefectTracker.DefectService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sgic.DefectTracker.DefectService.entities.DefectEntity;

public interface DefectRepository extends JpaRepository<DefectEntity, Long>{

}
