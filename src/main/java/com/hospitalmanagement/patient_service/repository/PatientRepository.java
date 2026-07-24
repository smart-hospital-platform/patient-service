package com.hospitalmanagement.patient_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalmanagement.patient_service.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, String>{

}
