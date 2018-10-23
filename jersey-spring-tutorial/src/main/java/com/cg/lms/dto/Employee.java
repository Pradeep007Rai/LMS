package com.cg.lms.dto;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="Employee")
@NamedQueries(
		value={@NamedQuery(name="getAllEmployees",query="from Employee employee")})
public class Employee {
	

	@Id
	@Column(name="employee_Id")
	private int EmployeeId;

	@Column(name="employee_name")
	private String employeeName;

	@OneToMany(mappedBy="employee",cascade=CascadeType.ALL)
	List<LeaveRecord> leaveRecords = new ArrayList<LeaveRecord>();
	
	@Column(name="employee_mail")
	private String employeeEmail;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dob;
	
	@ManyToOne
	@JoinColumn(name="project_Id")
	private Project project;
	
	
	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, Date dob, Project project) {
		super();
		EmployeeId = employeeId;
		this.employeeName = employeeName;
		this.dob = dob;
		this.project = project;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<LeaveRecord> getLeaveRecords() {
		return leaveRecords;
	}

	public void setLeaveRecords(List<LeaveRecord> leaveRecords) {
		this.leaveRecords = leaveRecords;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	
}
