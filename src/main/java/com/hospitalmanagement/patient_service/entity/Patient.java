package com.hospitalmanagement.patient_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
	
	@Id
	private String patientId;
	private String patientName;
	private Integer age;
	private String gender;
	private String mobileNumber;
	private String bloodGroup;
	private String address;
	private String email;


}
