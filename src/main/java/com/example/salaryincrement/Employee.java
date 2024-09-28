package com.example.salaryincrement;

public class Employee {
	private String name;
	private Department department;
	private double salary;

	public Employee(String name, Department department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public Department getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	// Calculate the incremented salary
	public double calculateIncrementedSalary() {
		double incrementedSalary = salary + salary * department.getAppraisalFactor();
		return incrementedSalary;
	}

	@Override
	public String toString() {
		return String.format("%s %s %.2f", name, department, calculateIncrementedSalary());
	}

}
