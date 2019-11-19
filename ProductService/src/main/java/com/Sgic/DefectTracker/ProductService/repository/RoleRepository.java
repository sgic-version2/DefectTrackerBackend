package com.Sgic.DefectTracker.ProductService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sgic.DefectTracker.ProductService.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

	boolean isRoleNameAlreadyExist(String role_name);



}
