package com.Sgic.DefectTracker.DefectService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Sgic.DefectTracker.DefectService.dto.ProjectCreateDTO;
import com.Sgic.DefectTracker.DefectService.dto.ProjectUpdateDTO;
import com.Sgic.DefectTracker.DefectService.services.ProjectServices;

@RestController
public class ProjectController {

	@Autowired
	private ProjectServices projectServices;

//	@PostMapping(value = "/project")
//	public ResponseEntity<?> createNote(@RequestBody Project project) {
//		projectServices.saveProject(project);
//		return new ResponseEntity<Object>(HttpStatus.OK);
//	}
//
//	@GetMapping("/project")
//	public List<Project> ListProject() {
//		return projectServices.getAllProject();
//	}
//
//	@GetMapping("/project/{id}")
//	public Optional<Project> getProjectgById(@PathVariable("id") Long id) {
//		return projectServices.findByID(id);
//	}
//
//	@PutMapping("/project/{id}")
//	public ResponseEntity<Object> updateProject(@RequestBody Project project, @PathVariable long id) {
//
//		Optional<Project> projectOptional = projectServices.findByID(id);
//
//		if (!projectOptional.isPresent())
//			return ResponseEntity.notFound().build();
//
//		project.setProjectId(id);
//
//		projectServices.saveProject(project);
//
//		return ResponseEntity.ok().build();
//	}
//
//	@DeleteMapping("/project/{id}")
//	public void deleteModule(@PathVariable long id) {
//		projectServices.deleteProject(id);
//	}

	@GetMapping("/project")
	public ResponseEntity<Object> getAllProjects() {
		return new ResponseEntity<Object>(projectServices.getAllProjects(), HttpStatus.OK);
	}

	@GetMapping("/project/{projectId}")
	public ResponseEntity<Object> getProjectById(@PathVariable("projectId") Long id) {
		return new ResponseEntity<Object>(projectServices.getProjectById(id), HttpStatus.OK);
	}

	@PostMapping("/project")
	public ResponseEntity<Object> addProject(@RequestBody ProjectCreateDTO projectCreateDTO) {
		return new ResponseEntity<Object>(projectServices.createProject(projectCreateDTO), HttpStatus.OK);
	}

	@PutMapping("/project/{projectId}")
	public ResponseEntity<Object> updateProject(@PathVariable("projectId") Long projectId,
			@RequestBody ProjectUpdateDTO projectUpdateDTO) {
		return new ResponseEntity<Object>(projectServices.updateProject(projectId, projectUpdateDTO), HttpStatus.OK);
	}

	@DeleteMapping("/project/{projectId}")
	public void deleteProject(@PathVariable("projectId") Long projectId) {
		projectServices.deleteProject(projectId);
	}
}
