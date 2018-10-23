package com.cg.lms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.lms.dto.Employee;
import com.cg.lms.dto.Project;

@Repository("employeeDao")
public class EmplyoyeeDao implements IEmployeeDao{
	@PersistenceContext
	EntityManager entityManager;
	
	
	public List<Employee> getEmployeeList() {
		List<Employee> employees = null;
		TypedQuery<Employee> query = entityManager.createNamedQuery("getAllEmployees", Employee.class);
		employees=query.getResultList();
		return employees;
	}


	@Override
	public void addEmployee(Employee employee) {
		entityManager.persist(employee);
		entityManager.flush();		
	}
}
