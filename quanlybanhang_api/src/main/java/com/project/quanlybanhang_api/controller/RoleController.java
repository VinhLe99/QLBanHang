package com.project.quanlybanhang_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.quanlybanhang_api.entity.Role;
import com.project.quanlybanhang_api.services.RoleServiceImp;

@RestController
@RequestMapping("/role")
public class RoleController {

	@Autowired
	RoleServiceImp roleServiceImp;
	
	@GetMapping("")
	public ResponseEntity<?> getAllRole() {
		return new ResponseEntity<List<Role>>(roleServiceImp.getAllRole(),HttpStatus.OK);
	}
}
