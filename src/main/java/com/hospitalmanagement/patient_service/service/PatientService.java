package com.hospitalmanagement.patient_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hospitalmanagement.patient_service.entity.Patient;


public interface PatientService {

	Patient createPatient(Patient patient);
	List<Patient> getAllPatients();
	Patient getPatientById(String patientId);
}
