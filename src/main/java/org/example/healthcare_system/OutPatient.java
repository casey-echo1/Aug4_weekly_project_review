package org.example.healthcare_system;

import java.util.List;

public class OutPatient extends Patient {
	private String appointmentDate, doctorName;

	public OutPatient(int patientID, String patientName, List<MedicalRecord> medicalHistory, String appointmentDate, String doctorName) {
		super(patientID, patientName, medicalHistory);
		this.appointmentDate = appointmentDate;
		this.doctorName = doctorName;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	@Override
	public String toString() {
		return "OutPatient{" +
			"appointmentDate='" + appointmentDate + '\'' +
			", doctorName='" + doctorName + '\'' +
			'}';
	}
}
