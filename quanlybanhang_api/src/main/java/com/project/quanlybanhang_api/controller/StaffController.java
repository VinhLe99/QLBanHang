package com.project.quanlybanhang_api.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.quanlybanhang_api.entity.Staff;
import com.project.quanlybanhang_api.services.StaffServiceImp;

@RestController
@RequestMapping("/staff")
public class StaffController {

	@Autowired
	StaffServiceImp staffServiceImp;
	
	@GetMapping("")
	public ResponseEntity<?> getAllStaff() {
		  List<Map<String, ?>> list = staffServiceImp.getAllStaff();
		  return new ResponseEntity<List<Map<String, ?>>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/t")
	public ResponseEntity<?> index() {		
		List<Map<String, ?>> list = staffServiceImp.getAllStaff2();
		return new ResponseEntity<List<Map<String, ?>>>(list,HttpStatus.OK);
	}
}
