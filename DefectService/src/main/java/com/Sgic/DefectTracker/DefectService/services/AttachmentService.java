package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.entities.Attachment;

@Service
public interface AttachmentService {

	// interface for get all attachments
	public List<Attachment> getAllAttachment();

	// interface for delete attachment
	public void deleteAttachment(Long id);

}
