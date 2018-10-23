package com.cg.lms.dto;

import java.util.Date;

public class ApplyLeave {

	private Date selectedDate;
	private Employee employee;
	
	public Date getSelectedDate() {
		return selectedDate;
	}
	public void setSelectedDate(Date selectedDate) {
		this.selectedDate = selectedDate;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployees(Employee employee) {
		this.employee = employee;
	}
	
}
