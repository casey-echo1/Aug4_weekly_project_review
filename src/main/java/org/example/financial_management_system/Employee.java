package org.example.financial_management_system;

public class Employee {
	private int id;
	private String name, position, department;
	private double salary, hourly_rate;

	public Employee() {}
	public Employee(int id, String name, double salary, String position, String department, double hourlyRate) {
		this.name = name;
		this.position = position;
		this.department = department;
		this.salary = salary;
		this.hourly_rate = hourly_rate;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPosition() {
		return position;
	}
	public String getDepartment() {
		return department;
	}
	public double getSalary() {
		return salary;
	}
	public double getHourly_rate() {
		return hourly_rate;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setHourly_rate(double hourly_rate) {
		this.hourly_rate = hourly_rate;
	}

	@Override
	public String toString() {
		return "Employee{" +
			"id=" + id +
			", name='" + name + '\'' +
			", position='" + position + '\'' +
			", department='" + department + '\'' +
			", salary=" + salary +
			", hourly_rate=" + hourly_rate +
			'}';
	}
}
