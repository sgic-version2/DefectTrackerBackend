package com.Sgic.DefectTracker.DefectService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sgic.DefectTracker.DefectService.entities.Comments;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long> {

}
