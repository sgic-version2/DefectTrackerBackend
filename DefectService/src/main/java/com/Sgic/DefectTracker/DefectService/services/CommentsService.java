package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import com.Sgic.DefectTracker.DefectService.entities.Comments;

public interface CommentsService {

	// Method for Save Comments Entity
	public Comments createComments(Comments comments);

	// Method for Comments List
	public List<Comments> getComments();

	// Method for Getting One Comments Record by ID
	public Optional<Comments> getCommentsById(Long id);

	// Method for Getting One Comments Record by Id
	public void deleteComments(Long id);

	
}
