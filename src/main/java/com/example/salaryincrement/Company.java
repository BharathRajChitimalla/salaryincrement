package com.example.salaryincrement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {
	private List<Employee> employees;

	public Company() {
		employees = new ArrayList<>();
	}

	// Method to add an employee to the company
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	
	// Generate Reverse Order Salary
	public void generateReport() {
		employees.sort(Comparator.comparingDouble(Employee::calculateIncrementedSalary).reversed());

		 // Print the formatted header with fixed column width
	    System.out.println(String.format("%-15s %-20s %-10s", "Name", "Department", "Salary"));

	    // Print the sorted list with alignment
	    for (Employee emp : employees) {
	        System.out.println(String.format("%-15s %-20s %-10.2f", emp.getName(), emp.getDepartment(), emp.getSalary()));
	    }
	}
}
