package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "matric_no")
	private String matricNo;
	
	@Column(name = "ic_no")
	private String icNo;
	
	@Column(name = "age")
	private String age;
	
	@Column(name = "phone_no")
	private String phoneNo;
	
	@Column(name = "home_Addr")
	private String homeAddr;
	
	@Column(name = "guardian_name")
	private String guardianName;
	
	@Column(name = "guardian_phoneno")
	private String guardianPhoneNo;
	
	@Column(name = "guardian_addr")
	private String guardianAddr;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMatricNo() {
		return matricNo;
	}

	public void setMatricNo(String matricNo) {
		this.matricNo = matricNo;
	}

	public String getIcNo() {
		return icNo;
	}

	public void setIcNo(String icNo) {
		this.icNo = icNo;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getHomeAddr() {
		return homeAddr;
	}

	public void setHomeAddr(String homeAddr) {
		this.homeAddr = homeAddr;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public String getGuardianPhoneNo() {
		return guardianPhoneNo;
	}

	public void setGuardianPhoneNo(String guardianPhoneNo) {
		this.guardianPhoneNo = guardianPhoneNo;
	}

	public String getGuardianAddr() {
		return guardianAddr;
	}

	public void setGuardianAddr(String guardianAddr) {
		this.guardianAddr = guardianAddr;
	}
	
	
	
}


