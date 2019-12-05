package com.Sgic.DefectTracker.DefectService.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sgic.DefectTracker.DefectService.entities.AttachmentUploadResponse;

@Repository
public interface AttachmentRepository extends JpaRepository<AttachmentUploadResponse, Long> {
	
//	Page<AttachmentUploadResponse> findByDefectId(Long defectId, Pageable pageable);
//
//	Optional<AttachmentUploadResponse> findByIdAndDefectId(Long id, Long defectId);
}
