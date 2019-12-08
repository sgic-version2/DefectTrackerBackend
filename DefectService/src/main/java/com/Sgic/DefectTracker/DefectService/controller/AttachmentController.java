package com.Sgic.DefectTracker.DefectService.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.Sgic.DefectTracker.DefectService.Exception.ResourceNotFoundException;
import com.Sgic.DefectTracker.DefectService.entities.AttachmentUploadResponse;
import com.Sgic.DefectTracker.DefectService.repositories.AttachmentRepository;
import com.Sgic.DefectTracker.DefectService.services.AttachmentStorageService;
import com.Sgic.DefectTracker.DefectService.services.AttachmentStorageServiceImpl;
import com.Sgic.DefectTracker.DefectService.services.DefectService;

@RestController
public class AttachmentController {

	private static final Logger logger = LoggerFactory.getLogger(AttachmentController.class);

	@Autowired
	private AttachmentStorageServiceImpl fileStorageService;

	@Autowired
	AttachmentStorageService attachmentStorageService;

	@Autowired
	DefectService defectService;

	@Autowired
	AttachmentRepository attachmentRepository;

	@PostMapping("/uploadFile")
	public AttachmentUploadResponse uploadFile(@RequestParam("file") MultipartFile file) {
		String fileName = fileStorageService.storeFile(file);

		String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/downloadFile/")
				.path(fileName).toUriString();

		return new AttachmentUploadResponse(fileName, fileDownloadUri, file.getContentType(), file.getSize());
	}

	@PostMapping("/uploadMultipleFiles")
	public List<AttachmentUploadResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
		return Arrays.asList(files).stream().map(file -> uploadFile(file)).collect(Collectors.toList());
	}

	@GetMapping("/downloadFile/{fileName:.+}")
	public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
		// Load file as Resource
		Resource resource = fileStorageService.loadFileAsResource(fileName);

		// Try to determine file's content type
		String contentType = null;
		try {
			contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
		} catch (IOException ex) {
			logger.info("Could not determine file type.");
		}

		// Fallback to the default content type if type could not be determined
		if (contentType == null) {
			contentType = "application/octet-stream";
		}

		return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
				.body(resource);
	}

	@PostMapping("defect/{defectId}/uploadFile")
	public AttachmentUploadResponse addAttachment(@PathVariable(value = "defectId") Long defectId,
			@Valid @RequestBody AttachmentUploadResponse attachment) {
		return defectService.getDefectEntityById(defectId).map(postRequest -> {
			attachment.setDefect(postRequest);
			return attachmentStorageService.addAttachment(attachment);
		}).orElseThrow(() -> new ResourceNotFoundException("defectId " + defectId + " not found"));
	}

	@GetMapping("/defectId/{defectId}/fileId/{fileId}")
	public ResponseEntity<AttachmentUploadResponse> getAttachment(@PathVariable(value = "defectId") Long defectId,
			@PathVariable(value = "fileId") Long fileId) {
		if (!attachmentRepository.existsById(defectId)) {
			throw new ResourceNotFoundException("defectId " + defectId + " not found");
		}

		attachmentStorageService.getAttachmentById(fileId);
		return new ResponseEntity<AttachmentUploadResponse>(HttpStatus.OK);
	}

	@DeleteMapping("/defectId/{defectId}/fileId/{fileId}")
	public ResponseEntity<AttachmentUploadResponse> deleteAttachmnetById(@PathVariable("defectId") Long defectId,
			@PathVariable(value = "fileId") Long fileId) {
		if(attachmentRepository.existsById(defectId)) {
			throw new ResourceNotFoundException("defectId " + defectId + " not found");
		}
		attachmentStorageService.deleteAttachment(fileId);
		return new ResponseEntity<AttachmentUploadResponse>(HttpStatus.OK);
	}

}