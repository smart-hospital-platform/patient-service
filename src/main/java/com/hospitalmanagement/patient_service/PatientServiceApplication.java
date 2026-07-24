package com.hospitalmanagement.patient_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hospitalmanagement.patient_service.entity.Patient;

@SpringBootApplication
public class PatientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientServiceApplication.class, args);
		
		/*Patient pat = new Patient();
		System.out.println("Patient Name is : " + pat.getPatientName());*/
	}

}
