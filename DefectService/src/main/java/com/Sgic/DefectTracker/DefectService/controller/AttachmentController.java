package com.Sgic.DefectTracker.DefectService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sgic.DefectTracker.DefectService.entities.Attachment;
import com.Sgic.DefectTracker.DefectService.services.AttachmentService;

@RestController
@RequestMapping("/api/v1")
public class AttachmentController {

	@Autowired
	AttachmentService attachmentService;

	@GetMapping("/attachment")
	public List<Attachment> getDefectStatus() {
		return attachmentService.getAllAttachment();

	}

	@DeleteMapping("/attachment/{id}")
	public ResponseEntity<?> deleteDefectStatus(@PathVariable Long id) {
		attachmentService.deleteAttachment(id);
		return ResponseEntity.ok().build();
	}
}
