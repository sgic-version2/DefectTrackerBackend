package com.Sgic.DefectTracker.DefectService.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "file")
public class AttachmentUploadResponse {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long fileId;
	private String fileName;
	private String fileDownloadUri;
	private String fileType;
	private long size;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REMOVE })
	@JoinColumn(name = "defectId")
	private Defect defect;

	public AttachmentUploadResponse(String fileName, String fileDownloadUri, String fileType, long size) {
		this.fileName = fileName;
		this.fileDownloadUri = fileDownloadUri;
		this.fileType = fileType;
		this.size = size;
	}

	public long getFileId() {
		return fileId;
	}

	public void setFileId(long fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileDownloadUri() {
		return fileDownloadUri;
	}

	public void setFileDownloadUri(String fileDownloadUri) {
		this.fileDownloadUri = fileDownloadUri;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public Defect getDefect() {
		return defect;
	}

	public void setDefect(Defect defect) {
		this.defect = defect;
	}

}