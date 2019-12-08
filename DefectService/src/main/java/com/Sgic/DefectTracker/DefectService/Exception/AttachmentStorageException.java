package com.Sgic.DefectTracker.DefectService.Exception;

public class AttachmentStorageException extends RuntimeException {
	public AttachmentStorageException(String message) {
		super(message);
	}

	public AttachmentStorageException(String message, Throwable cause) {
		super(message, cause);
	}
}