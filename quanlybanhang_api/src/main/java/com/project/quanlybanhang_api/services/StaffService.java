package com.project.quanlybanhang_api.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.quanlybanhang_api.entity.Staff;
import com.project.quanlybanhang_api.respository.StaffRespository;

@Transactional
@Service
public class StaffService implements StaffServiceImp{

	@Autowired
	StaffRespository staffRespository;

	@Override
	public List<Map<String, ?>> getAllStaff() {
		// TODO Auto-generated method stub
		return staffRespository.GetAllStaff();
	}
	@Override
	public List<Map<String, ?>> getAllStaff2() {
		// TODO Auto-generated method stub
		return staffRespository.GetAllStaff2();
	}

}
