package com.cg.lms.controller;


import java.util.Iterator;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import com.cg.lms.dto.Employee;
import com.cg.lms.services.IEmployeeService;

//


@Controller
@Path("/employee")
public class EmployeeController<E> {
	
	@Autowired
	IEmployeeService employeeService;
	
	@Path("/add")
	@Produces(MediaType.TEXT_PLAIN)
	@POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String addEmployee(Employee employee) {
			employeeService.addEmployee(employee);
			return employee.toString();
		}	
	
	@Path("/getList")
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getEmployee() {
		List<Employee> employees = employeeService.getEmployeeList();
		for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			employee.getProject().setEmployeeList(null);
			employee.setLeaveRecords(null);
		}
      return employees;
    }
	
	
}
