package com.hospitalmanagement.patient_service.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalmanagement.patient_service.entity.Patient;
import com.hospitalmanagement.patient_service.service.PatientService;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/patients")
@Slf4j
public class PatientController {
	
	private final PatientService patientService;

	public PatientController(PatientService patientService) {
		this.patientService = patientService;
	}
	
	@PostMapping
	public ResponseEntity<Patient> createPatient(
			@Valid @RequestBody Patient patient) {
		
		log.info("Create Patient API request is received");
		Patient createdPatient = patientService.createPatient(patient);
		log.info("Create Patient API completed successfully!");
		return ResponseEntity.ok(createdPatient);
	}
	
	@GetMapping("/getAllPatients")
	public List<Patient> getAllPatients() {
		log.info("Get All Patients API request is received");
		List<Patient> patients = patientService.getAllPatients();
		log.info("Get All Patients API completed sucessfully. Total patients fetched : {}", patients.size());
		return patients;
	}
	
	@GetMapping("/{patientId}")
	public Patient getPatientById(@PathVariable String patientId) {
		log.info("Request received to get Patient details");
		Patient patient = patientService.getPatientById(patientId);
		log.info("Successfully feteched patient details");
		return patient;
	}
	

}
