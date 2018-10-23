package com.cg.lms.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lms.dao.IEmployeeDao;
import com.cg.lms.dto.Employee;

@Service("employeeService")
@Transactional
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	private IEmployeeDao employeeDao;
	public List<Employee> getEmployeeList()
	{
		return employeeDao.getEmployeeList();
	}
	@Override
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
		
	}
}
