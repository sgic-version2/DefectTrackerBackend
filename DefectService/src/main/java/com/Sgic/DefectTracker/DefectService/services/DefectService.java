package com.Sgic.DefectTracker.DefectService.services;

import java.util.List;
import java.util.Optional;

import com.Sgic.DefectTracker.DefectService.dto.DefectCreateDTO;
import com.Sgic.DefectTracker.DefectService.dto.DefectDTO;
import com.Sgic.DefectTracker.DefectService.dto.DefectUpdateDTO;
import com.Sgic.DefectTracker.DefectService.entities.Defect;

public interface DefectService {
	// Method for Getting One Defect Record by ID
	public Optional<Defect> getDefectEntityById(Long id);

	public Defect createDefect(Long projectId, DefectCreateDTO defectCreateDTO);

	public List<Object> getAllDefects(Long projectId);
	
	public List<Object> getDefectsById(Long projectId, Long defectId);
	
	public DefectDTO updateDefect(Long projectId, Long defectId, DefectUpdateDTO defectUpdateDTO);
	
	public void deleteDefect(Long projectId, Long defectId);

}
