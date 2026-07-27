package com.hospitalmanagement.patient_service.dto;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientDTO {
	
	@NotBlank(message = "Patient ID cannot be blank")
	private String patientId;

	@NotBlank(message = "Patient Name cannot be blank")
	private String patientName;

	@Min(value = 1, message = "Age must be greater than 0")
	@Max(value = 120, message = "Age cannot be greater than 120")
	private Integer age;

	@NotBlank(message = "Gender cannot be blank")
	@Pattern(regexp = "Male|Female|Other", message = "Gender must be Male, Female or Other")
	private String gender;

	@NotBlank(message = "Mobile Number cannot be blank")
	@Pattern(regexp = "^[0-9]{10}$", message = "Mobile Number must contain exactly 10 digits")
	private String mobileNumber;

	@NotBlank(message = "Blood Group cannot be blank")
	@Pattern(regexp = "^(A|B|AB|O)[+-]$", message = "Invalid Blood Group")
	private String bloodGroup;

	@NotBlank(message = "Address cannot be blank")
	private String address;

	@Email(message = "Invalid Email Format")
	@NotBlank(message = "Email cannot be blank")
	private String email;

}
