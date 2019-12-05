package com.Sgic.DefectTracker.DefectService.services;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface AttachmentStorageService {
	public String storeFile(MultipartFile file);
	public Resource loadFileAsResource(String fileName);
}
