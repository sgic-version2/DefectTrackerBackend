//package com.Sgic.DefectTracker.DefectService.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.Sgic.DefectTracker.DefectService.entities.Project;
//import com.Sgic.DefectTracker.DefectService.repositories.ProjectRepository;
//import com.Sgic.DefectTracker.DefectService.services.ProjectServices;
//
//@RestController
//public class ProjectController {
//
//	@Autowired
//	
//	private ProjectServices projectServices;
//	
////	@PostMapping("")
////	
////	public ResponseEntity<String> save(@RequestBody Project project){
////		projectServices.save(project);
////		return new ResponseEntity<String>("",HttpStatus.OK);
////                                                                }
//	
//
////	@GetMapping("")
////	public List<Module> getModule() {
////		return moduleServices.findAll();
//
////	}
//
////	@PutMapping("/employee/{id}")
////	public ResponseEntity<Object> updateEmployee(@RequestBody Module module, @PathVariable long module_id) {
////
////		Optional<Module> moduleOptional = moduleServices.findById(module_id);
////
////		if (!moduleOptional.isPresent())
////			return ResponseEntity.notFound().build();
////
////		module.setId(module_id);
////
////		moduleServices.save(module);
////
////		return ResponseEntity.noContent().build();
////	}
////	@DeleteMapping("")
////	public void deleteEmployee(@PathVariable long module_id) {
////		moduleServices.delete(module_id);
////	}
////	
//
//}
