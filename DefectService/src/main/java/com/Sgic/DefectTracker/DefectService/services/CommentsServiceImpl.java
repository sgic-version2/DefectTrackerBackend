package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sgic.DefectTracker.DefectService.entities.Comments;
import com.Sgic.DefectTracker.DefectService.repositories.CommentsRepository;


@Service
public class CommentsServiceImpl implements CommentsService {

	@Autowired
	CommentsRepository commentsRepository;
	
	@Override
	public Comments createComments(Comments comments) {
		return commentsRepository.save(comments);
	}

	@Override
	public List<Comments> getComments() {
		return commentsRepository.findAll();
	}

	@Override
	public Optional<Comments> getCommentsById(Long id) {
		return commentsRepository.findById(id);
	}

	@Override
	public void deleteComments(Long id) {
		commentsRepository.deleteById(id);
	}

	

}
