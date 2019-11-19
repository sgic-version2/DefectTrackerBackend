package com.Sgic.DefectTracker.DefectService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Sgic.DefectTracker.DefectService.services.SubModuleService;

@Repository
@RequestMapping("/ap/v1")
public class SubModuleController {

	
	@Autowired
	private SubModuleService subModuleService;
	
//	@PostMapping("")
//	
//	public ResponseEntity<String> save(@RequestBody Project project){
//		projectServices.save(project);
//		return new ResponseEntity<String>("",HttpStatus.OK);
//                                                                }
	

//	@GetMapping("")
//	public List<Module> getModule() {
//		return moduleServices.findAll();

//	}

//	@PutMapping("/employee/{id}")
//	public ResponseEntity<Object> updateEmployee(@RequestBody Module module, @PathVariable long module_id) {
//
//		Optional<Module> moduleOptional = moduleServices.findById(module_id);
//
//		if (!moduleOptional.isPresent())
//			return ResponseEntity.notFound().build();
//
//		module.setId(module_id);
//
//		moduleServices.save(module);
//
//		return ResponseEntity.noContent().build();
//	}
//	@DeleteMapping("")
//	public void deleteEmployee(@PathVariable long module_id) {
//		moduleServices.delete(module_id);
//	}
//	

}
