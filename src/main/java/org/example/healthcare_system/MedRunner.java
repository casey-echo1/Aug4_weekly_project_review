package org.example.healthcare_system;

public class MedRunner {
	public static void main(String[] args) {

		Patient patient1 = new Patient(123, "Jeremy Thompson");
		MedicalRecord medRecord1 = new MedicalRecord("8/4/24", "gives love a bad name");
		patient1.addMedicalRecord(medRecord1);

		Inpatient inpatient1 = new Inpatient(patient1, "8/4/24", "101");

		Hospital hospital = new Hospital();
		hospital.addPatient(inpatient1);

		System.out.println(inpatient1.toString());


	}
}
