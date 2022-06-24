package com.project.quanlybanhang_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.quanlybanhang_api.entity.Role;
import com.project.quanlybanhang_api.respository.RoleRespository;

@Transactional
@Service
public class RoleService implements RoleServiceImp{

	@Autowired
	RoleRespository roleRespository;

	@Override
	public List<Role> getAllRole() {
		return roleRespository.findAll();
	}
	
	
}
