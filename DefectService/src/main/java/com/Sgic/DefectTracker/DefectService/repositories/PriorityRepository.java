package com.Sgic.DefectTracker.DefectService.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sgic.DefectTracker.DefectService.entities.Priority;

@Repository
public interface PriorityRepository extends JpaRepository<Priority, Long> {
//	@Query(value = "from Severity where name = :name")
//	ResponseEntity<List<Severity>> findByName(String name);

//	@Query("select from Severity where serverityId:=serverityId")
//	Severity findByseverityId(Long id);

}
