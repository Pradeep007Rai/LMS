package com.cg.lms.services;

import java.util.List;

import com.cg.lms.dto.Employee;

public interface IEmployeeService {
	public List<Employee> getEmployeeList();
	public void addEmployee(Employee employee);
}
