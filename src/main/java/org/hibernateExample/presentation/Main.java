package org.hibernateExample.presentation;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setEmail("john.doe@example.com");

        employeeService.saveEmployee(employee);

        for (Employee emp : employeeService.getEmployees()) {
            System.out.println("Employee: " + emp.getName() + ", Email: " + emp.getEmail());
        }
    }
}