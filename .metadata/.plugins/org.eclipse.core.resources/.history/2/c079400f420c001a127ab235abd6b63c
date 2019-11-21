package com.Sgic.DefectTracker.DefectService.controller;

import java.util.List;
import java.util.Optional;

import javax.management.relation.RelationNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sgic.DefectTracker.DefectService.Exception.ResourceNotFoundException;
import com.Sgic.DefectTracker.DefectService.entities.Comments;
import com.Sgic.DefectTracker.DefectService.services.CommentsService;

@RestController

@RequestMapping("/api/v1")
public class CommentController {
	@Autowired
	CommentsService commentsService;

	@PostMapping(value = "/comments")

	public ResponseEntity<?> createPriority(@RequestBody Comments comments) {
		commentsService.createComments(comments);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

	@GetMapping("/comments")
	public ResponseEntity<List<Comments>> getComments() {
		return new ResponseEntity<List<Comments>>(commentsService.getComments(), HttpStatus.OK);
	}

	@DeleteMapping("/comments/{id}")
	public ResponseEntity<?> deleteComments(@PathVariable Long id) {
		commentsService.deleteComments(id);
		return ResponseEntity.ok().build();
	}



	@GetMapping("/getcommentById/{commentsId}")
	public ResponseEntity<Comments> getCommentById(@PathVariable(value = "id") Long id)
			throws RelationNotFoundException {
		Comments comments = commentsService.getCommentsById(id)
				.orElseThrow(() -> new ResourceNotFoundException(" not found for this id :: " + id));
		return ResponseEntity.ok().body(comments);
	}

	@PutMapping("/updatecomments/{id}")
	public ResponseEntity<Object> editComments(@RequestBody Comments comments, @PathVariable("id") long id) {

		Optional<Comments> CommentsOptional = commentsService.getCommentsById(id);

		if (!CommentsOptional.isPresent())
			return ResponseEntity.notFound().build();

		comments.setCommentId(id);

		commentsService.createComments(comments);

		return ResponseEntity.noContent().build();
	}

}
