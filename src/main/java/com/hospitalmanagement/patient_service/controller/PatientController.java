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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalmanagement.patient_service.dto.PatientDTO;
import com.hospitalmanagement.patient_service.entity.Patient;
import com.hospitalmanagement.patient_service.service.PatientService;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Tag(name = "Patient Management",
description = "Patient Service APIs")
@RestController
@RequestMapping("/patients")
@Slf4j
public class PatientController {
	
	private final PatientService patientService;

	public PatientController(PatientService patientService) {
		this.patientService = patientService;
	}
	
	@PostMapping
	public ResponseEntity<PatientDTO> createPatient(
			@Valid @RequestBody PatientDTO patient) {
		
		log.info("Create Patient API request is received");
		PatientDTO createdPatient = patientService.createPatient(patient);
		log.info("Create Patient API completed successfully!");
		return ResponseEntity.ok(createdPatient);
	}
	
	@GetMapping("/getAllPatients")
	public List<PatientDTO> getAllPatients() {
		log.info("Get All Patients API request is received");
		List<PatientDTO> patients = patientService.getAllPatients();
		log.info("Get All Patients API completed sucessfully. Total patients fetched : {}", patients.size());
		return patients;
	}
	
	@GetMapping("/{patientId}")
	public PatientDTO getPatientById(@PathVariable String patientId) {
		log.info("Request received to get Patient details");
		PatientDTO patient = patientService.getPatientById(patientId);
		log.info("Successfully feteched patient details");
		return patient;
	}
	
	@GetMapping("/search")
	public List<PatientDTO> searchPatientByName(
			@RequestParam String patientName){
		List<PatientDTO> patient = patientService.searchPatientByName(patientName);
		return patient;
	}
	

}
