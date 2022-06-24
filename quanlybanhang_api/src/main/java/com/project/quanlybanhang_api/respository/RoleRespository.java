package com.project.quanlybanhang_api.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.quanlybanhang_api.entity.Role;

public interface RoleRespository extends JpaRepository<Role, Integer>{

	List<Role> findAll();
}
