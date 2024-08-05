package org.example.financial_management_system;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriter {
	public static void writeEmployeesToCSV(List<Employee> employees, String file) throws IOException {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write("id,name,salary,position,department,hourlyRate");
			for (Employee employee : employees) {
				int id = employee.getId();
				String name = employee.getName();
				double salary = employee.getSalary();
				String position = employee.getPosition();
				String department = employee.getDepartment();
				double hourly_rate = employee.getHourly_rate();
				bw.write(String.format("%d,%s,%d,%s,%s,%d",id,name,salary,position,department,hourly_rate));
			}
		}
	}
}
