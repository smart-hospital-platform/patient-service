package com.hospitalmanagement.patient_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hospitalmanagement.patient_service.dto.PatientDTO;



public interface PatientService {

	PatientDTO createPatient(PatientDTO patient);
	List<PatientDTO> getAllPatients();
	PatientDTO getPatientById(String patientId);
}
