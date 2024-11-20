package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        executeTasks();
    }

    public static void executeTasks() {
        // Healthplan instance
        Healthplan healthplan = new Healthplan(1, "Standard Plan", Plan.BASIC);
        System.out.println(healthplan);

        // Employee instance
        Employee employee = new Employee(101, "Jane Doe", "jane.doe@example.com", "password123", 3);
        employee.addHealthplan(0, "Basic Health");
        System.out.println(employee);

        // Company instance
        Company company = new Company(201, "TechCorp", 100000, 5);
        company.addEmployee(0, "John Developer");
        System.out.println(company);
    }
}