package com.Sgic.DefectTracker.DefectService.services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.Sgic.DefectTracker.DefectService.Exception.AttachmentNotFoundException;
import com.Sgic.DefectTracker.DefectService.Exception.AttachmentStorageException;
import com.Sgic.DefectTracker.DefectService.entities.AttachmentStorageProperties;

@Service
public class AttachmentStorageServiceImpl implements AttachmentStorageService {

	private final Path fileStorageLocation;

	@Autowired
	public AttachmentStorageServiceImpl(AttachmentStorageProperties fileStorageProperties) {
		this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir()).toAbsolutePath().normalize();

		try {
			Files.createDirectories(this.fileStorageLocation);
		} catch (Exception ex) {
			throw new AttachmentStorageException(
					"Could not create the directory where the uploaded files will be stored.", ex);
		}
	}

	@Override
	public String storeFile(MultipartFile file) {
		// Normalize file name
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());

		try {
			// Check if the file's name contains invalid characters
			if (fileName.contains("..")) {
				throw new AttachmentStorageException("Sorry! Filename contains invalid path sequence " + fileName);
			}

			// Copy file to the target location (Replacing existing file with the same name)
			Path targetLocation = this.fileStorageLocation.resolve(fileName);
			Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

			return fileName;
		} catch (IOException ex) {
			throw new AttachmentStorageException("Could not store file " + fileName + ". Please try again!", ex);
		}
	}

	@Override
	public Resource loadFileAsResource(String fileName) {
		try {
			Path filePath = this.fileStorageLocation.resolve(fileName).normalize();
			Resource resource = new UrlResource(filePath.toUri());
			if (resource.exists()) {
				return resource;
			} else {
				throw new AttachmentNotFoundException("File not found " + fileName);
			}
		} catch (MalformedURLException ex) {
			throw new AttachmentNotFoundException("File not found " + fileName, ex);
		}
	}
}