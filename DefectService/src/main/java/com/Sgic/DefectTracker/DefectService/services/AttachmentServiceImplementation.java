package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.entities.Attachment;
import com.Sgic.DefectTracker.DefectService.repositories.AttachmentRepository;

@Service
public class AttachmentServiceImplementation implements AttachmentService {

	@Autowired
	AttachmentRepository attachmentRepo;

	@Override
	public List<Attachment> getAllAttachment() {
		return attachmentRepo.findAll();
	}

	@Override
	public void deleteAttachment(Long id) {
		attachmentRepo.deleteById(id);
	}
}
