package com.cg.lms.dao;

import java.util.List;

import com.cg.lms.dto.Employee;
import com.cg.lms.dto.Project;

public interface IEmployeeDao {
	
	public List<Employee> getEmployeeList();
	public void addEmployee(Employee employee);
}
