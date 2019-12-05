package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.Sgic.DefectTracker.DefectService.entities.AttachmentUploadResponse;

@Service
public interface AttachmentStorageService {

	public String storeFile(MultipartFile file);

	public Resource loadFileAsResource(String fileName);

	public AttachmentUploadResponse addAttachment(AttachmentUploadResponse uploadResponse);

	public List<AttachmentUploadResponse> getAttachment();

	public Optional<AttachmentUploadResponse> getAttachmentById(Long id);

	public void deleteAttachment(Long id);
}
