package com.hari.devops.patient_api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PatientService {
	  private final List<Patient> patients = new ArrayList<>();

	    public List<Patient> getAllPatients() {
	        return patients;
	    }

	    public void addPatient(Patient patient) {
	        patients.add(patient);
	    }
}
