package com.ncc.spring.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table
public class Student {
	@Id
	@GeneratedValue
	private int studentId;
	private String fname;
	private String lname;
	private String gender;
	private String phone;
	private String email;
	private String fathername;
	private String mothername;
	private Date dob;
	private Date joiningDate;
	private String parentcontact;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addrId")
	private Address address;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FacId")
	private Faculty faculty;
	@OneToMany(mappedBy = "student",fetch = FetchType.LAZY)
	private List<Fee> fee;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getParentcontact() {
		return parentcontact;
	}
	public void setParentcontact(String parentcontact) {
		this.parentcontact = parentcontact;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
public List<Fee> getFee() {
		return fee;
	}
	public void setFee(List<Fee> fee) {
		this.fee = fee;
	}
	
	

}
