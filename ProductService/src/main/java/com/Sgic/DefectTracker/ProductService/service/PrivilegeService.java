package com.Sgic.DefectTracker.ProductService.service;

import java.util.List;
import java.util.Optional;

import com.Sgic.DefectTracker.ProductService.entities.Privilege;

public interface PrivilegeService {

	public Privilege createPrivilege(Privilege privilege);

	public List<Privilege> getAllPrivileges();

	public Optional<Privilege> findByID(Long Pid);

	public void deletePrivilege(long Pid);

	
}
