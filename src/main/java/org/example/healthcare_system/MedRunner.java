package org.example.healthcare_system;

public class MedRunner {
	public static void main(String[] args) {

		Patient patient1 = new Patient(123, "Jeremy Thompson");
		Hospital hospital = new Hospital();
		hospital.addPatient(patient1);


	}
}
