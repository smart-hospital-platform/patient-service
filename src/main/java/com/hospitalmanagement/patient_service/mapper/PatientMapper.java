package com.hospitalmanagement.patient_service.mapper;

import com.hospitalmanagement.patient_service.dto.PatientDTO;
import com.hospitalmanagement.patient_service.entity.Patient;

public class PatientMapper {
	
	public static Patient toEntity(PatientDTO patientDTO) {
		
		Patient patient = new Patient();
		patient.setPatientId(patientDTO.getPatientId());
		patient.setPatientName(patientDTO.getPatientName());
		patient.setAddress(patientDTO.getAddress());
		patient.setAge(patientDTO.getAge());
		patient.setBloodGroup(patientDTO.getBloodGroup());
		patient.setEmail(patientDTO.getEmail());
		patient.setGender(patientDTO.getGender());
		patient.setMobileNumber(patientDTO.getMobileNumber());
		
		return patient;
	}
	
	public static PatientDTO toPatientDTO(Patient patient) {
		
		PatientDTO patientDTO = new PatientDTO();
		patientDTO.setAddress(patient.getAddress());
		patientDTO.setAge(patient.getAge());
		patientDTO.setBloodGroup(patient.getBloodGroup());
		patientDTO.setEmail(patient.getEmail());
		patientDTO.setGender(patient.getGender());
		patientDTO.setMobileNumber(patient.getMobileNumber());
		patientDTO.setPatientId(patient.getPatientId());
		patient.setPatientName(patient.getPatientName());
		
		return patientDTO;
	}

}
