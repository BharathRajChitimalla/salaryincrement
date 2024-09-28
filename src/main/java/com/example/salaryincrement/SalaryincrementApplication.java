package com.example.salaryincrement;

public class SalaryincrementApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Company company = new Company();

		// Adding employees
		company.addEmployee(new Employee("Joey", Department.SALES, 480000));
		company.addEmployee(new Employee("Ross", Department.OPERATIONS, 550000));
		company.addEmployee(new Employee("Monica", Department.MANAGER, 450000));
		company.addEmployee(new Employee("Phoebe", Department.SALES, 600000));
		company.addEmployee(new Employee("Chandler", Department.DEVELOPER, 530000));
		company.addEmployee(new Employee("Rachel", Department.OPERATIONS, 580000));

		// Generate Report
		company.generateReport();

	}

}
