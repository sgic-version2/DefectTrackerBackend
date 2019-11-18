package com.Sgic.DefectTracker.ProductService.service;

import com.Sgic.DefectTracker.ProductService.entities.Privilege;

public interface PrivilegeService {
	
	public Privilege createPrivilege(Privilege privlege);
	public boolean isEmailAlreadyExist(String email);

}
