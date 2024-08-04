package org.example.healthcare_system;

import java.util.ArrayList;
import java.util.List;

//declare generic intention + constraint in class declaration
public class Hospital<T extends Patient> {
	//T has already been constrained, so just use T for rest of class
	private List<T> patients = new ArrayList<>();

	public Hospital() {}

	public Patient getPatient(int patientID) {
		for (Patient patient : patients) {
			if (patient.getPatientID() == patientID) return patient;
		} return null;
	}
	public void addPatient(T patient) {
		patients.add(patient);
	}
}
