package com.hospitalmanagement.patient_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hospitalmanagement.patient_service.entity.Patient;
import com.hospitalmanagement.patient_service.exception.PatientNotFoundException;
import com.hospitalmanagement.patient_service.repository.PatientRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PatientServiceImpl implements PatientService{
	
	private final PatientRepository patientRepository;
	
	public PatientServiceImpl(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}

	@Override
	public Patient createPatient(Patient patient) {
		log.info("Saving request with ID : {}", patient.getPatientId());
		Patient savedPatient = patientRepository.save(patient);
		log.info("Patient saved successfully with ID : {}", patient.getPatientId());
		return savedPatient; 
	}
	
	@Override
	public List<Patient> getAllPatients() {
		log.info("Fetching all the Patients from the database");
		List<Patient> patients = patientRepository.findAll();
		log.info("Successfully feteched {} patients from the database", patients.size());
		return patients;
	}
	
	@Override
	public Patient getPatientById(String patientId) {
		log.info("Fetching patient with ID : {}", patientId);
		Patient patient = patientRepository.findById(patientId)
				.orElseThrow(() -> new PatientNotFoundException(
						"Patient not found with ID : " + patientId));
		log.info("Successfully feteched patient with ID : {} from database", patientId);
		return patient;
	}

}
