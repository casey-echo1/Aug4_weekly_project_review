package org.example.healthcare_system;

import java.util.List;

public class Inpatient extends Patient {
	private String admissionDate, roomNumber;

	public Inpatient(int patientID, String patientName, List<MedicalRecord> medicalHistory, String admissionDate, String roomNumber) {
		super(patientID, patientName, medicalHistory);
		this.admissionDate = admissionDate;
		this.roomNumber = roomNumber;
	}
	public Inpatient(int patientID, String patientName, String admissionDate, String roomNumber) {
		super(patientID, patientName);
		this.admissionDate = admissionDate;
		this.roomNumber = roomNumber;
	}


	@Override
	public String toString() {
		return "Inpatient{" +
			"admissionDate='" + admissionDate + '\'' +
			", roomNumber='" + roomNumber + '\'' +
			'}';
	}
}
