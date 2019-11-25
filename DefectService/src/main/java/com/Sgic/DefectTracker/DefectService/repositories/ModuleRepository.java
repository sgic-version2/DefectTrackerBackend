package com.Sgic.DefectTracker.DefectService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sgic.DefectTracker.DefectService.entities.Module;

public interface ModuleRepository extends JpaRepository<Module, Long> {

}
