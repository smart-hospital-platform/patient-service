package com.hospitalmanagement.patient_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalmanagement.patient_service.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, String>{
	
	public List<Patient> findByPatientNameContainingIgnoreCase(String patientName);

}
