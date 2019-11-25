package com.Sgic.DefectTracker.ProductService.service;

import java.util.List;
import java.util.Optional;

import com.Sgic.DefectTracker.ProductService.entities.Privilege;
import com.Sgic.DefectTracker.ProductService.entities.ProductPrivilege;

public interface ProductPrivilegeService {

	public ProductPrivilege createProductPrivilege(ProductPrivilege productPrivilege);

	public List<ProductPrivilege> getAllProductPrivileges();

	public Optional<ProductPrivilege> findByID(Long PRid);

	public void deleteProductPrivilege(long PRid);

}
