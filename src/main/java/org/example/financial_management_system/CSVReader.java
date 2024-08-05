package org.example.financial_management_system;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
	public List<Employee> readEmployeesFromCSV(String file) throws IOException {
		List<Employee> employees = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = br.readLine();

			while ((line = br.readLine()) != null) {
				String[] dataArr = line.split(",");
				int id = Integer.parseInt(dataArr[0]);
				String name = dataArr[1];
				double salary = Double.parseDouble(dataArr[2]);
				String position = dataArr[3];
				String department = dataArr[4];
				double hourlyRate = Double.parseDouble(dataArr[5]);

				employees.add(new Employee(id, name, salary, position, department, hourlyRate));
			}
		} return employees;
	}
}
