package org.example.healthcare_system;

import java.util.List;

public class Patient {
	private int patientID;
	private String patientName;
	private List<MedicalRecord> medicalHistory;

	public Patient(int patientID, String name, List<MedicalRecord> medicalHistory) {
		this.patientID = patientID;
		this.patientName = name;
		this.medicalHistory = medicalHistory;
	}

	public int getPatientID() {
		return patientID;
	}
	public String getPatientName() {
		return patientName;
	}
	public List<MedicalRecord> getMedicalHistory() {
		return medicalHistory;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public void setMedicalHistory(List<MedicalRecord> medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	public void addMedicalRecord(MedicalRecord record) {
		this.medicalHistory.add(record);
	}
	public void updateMedicalRecord(int index, MedicalRecord newRecord) {
		this.medicalHistory.set(index, newRecord);
	}
	public void getMedicalRecord(int index) {
		this.medicalHistory.get(index);
	}


}
