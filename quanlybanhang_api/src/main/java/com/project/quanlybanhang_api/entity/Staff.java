package com.project.quanlybanhang_api.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity( name = "staff")
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column( name = "staff_name")
	private String staffName;
	
	@Column( name = "age")
	private int age;
	
	@Column( name = "phone_number")
	private int phoneNumber;
	
	@Column( name = "email")
	private String email;
	
	@Column( name = "staff_address")
	private String staffAddress;
	
	@Column( name = "gender")
	private int gender;
	
	@Column( name = "birthofday")
	private String birthOfDay;
	
	@OneToOne
	@JoinColumn(name = "role_id")
	private Role role;
	
	@OneToOne(mappedBy = "staff")
    private Users users;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStaffAddress() {
		return staffAddress;
	}

	public void setStaffAddress(String staffAddress) {
		this.staffAddress = staffAddress;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getBirthOfDay() {
		return birthOfDay;
	}

	public void setBirthOfDay(String birthOfDay) {
		this.birthOfDay = birthOfDay;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	
	
}
