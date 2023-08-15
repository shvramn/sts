package com.hospital.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "appointment")
public class Appointment {
	
	@Id
	private Long id;
	
	private Long userId;
	private String fullName;
	private String gender;
	private String age;
	private String appointmentDate;
	private String email;
	private String phone;
	private String diseases;
	private Long doctorId;
	private String address;
	private String status;
	
	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Appointment(Long id, Long userId, String fullName, String gender, String age, String appointmentDate,
			String email, String phone, String diseases, Long doctorId, String address, String status) {
		super();
		this.id = id;
		this.userId = userId;
		this.fullName = fullName;
		this.gender = gender;
		this.age = age;
		this.appointmentDate = appointmentDate;
		this.email = email;
		this.phone = phone;
		this.diseases = diseases;
		this.doctorId = doctorId;
		this.address = address;
		this.status = status;
	}


	public Appointment(Long userId, String fullName, String gender, String age, String appointmentDate, String email,
			String phone, String diseases, Long doctorId, String address, String status) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.gender = gender;
		this.age = age;
		this.appointmentDate = appointmentDate;
		this.email = email;
		this.phone = phone;
		this.diseases = diseases;
		this.doctorId = doctorId;
		this.address = address;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDiseases() {
		return diseases;
	}
	public void setDiseases(String diseases) {
		this.diseases = diseases;
	}
	public Long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
