package org.example.healthcare_system;

public class Inpatient {
	private String admissionDate, roomNumber;

	public Inpatient(int patientID, String patientName, String admissionDate, String roomNumber) {
		super();
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
