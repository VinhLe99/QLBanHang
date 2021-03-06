package com.project.quanlybanhang_api.respository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.quanlybanhang_api.entity.Staff;

public interface StaffRespository extends JpaRepository<Staff, Integer>{

	@Query(value = "call GetAllStaff", nativeQuery = true)
	List<Map<String,?>> GetAllStaff();
	
	@Query(value = "select * from staff", nativeQuery = true)
	List<Map<String,?>> GetAllStaff2();
}
