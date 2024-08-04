package org.example.healthcare_system;

public class MedicalRecord {
	private String date, description;

	public MedicalRecord(String date, String description) {
		this.date = date;
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public String getDescription() {
		return description;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "MedicalRecord{" +
			"date='" + date + '\'' +
			", description='" + description + '\'' +
			'}';
	}
}
