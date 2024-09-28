package com.example.salaryincrement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void testCalculateIncrementedSalary() {
        Employee employee = new Employee("TestDev", Department.DEVELOPER, 500000);
        assertEquals(575000, employee.calculateIncrementedSalary(), 0.001);

        Employee employee2 = new Employee("TestManager", Department.MANAGER, 400000);
        assertEquals(448000, employee2.calculateIncrementedSalary(), 0.001);
    }
}