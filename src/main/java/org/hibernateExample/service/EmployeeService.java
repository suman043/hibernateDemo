package org.hibernateExample.service;

import org.hibernateExample.dao.EmployeeDAO;
import org.hibernateExample.entity.Employee;

import java.util.List;

public class EmployeeService {
    private EmployeeDAO employeeDAO;

    public EmployeeService() {
        this.employeeDAO = new EmployeeDAO();
    }

    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    public List<Employee> getEmployees() {
        return employeeDAO.getEmployees();
    }
}
