package com.cg.lms.dto;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="leaveRecord")
@NamedQueries(
		value={@NamedQuery(name="getAllLeaveRecord",query="from LeaveRecord leaveRecord where leaveRecord.leaveDate=:leaveDate")})
public class LeaveRecord {
	// 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="leave_id")
	private int leaveId;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date leaveDate;
	
	@ManyToOne
	@JoinColumn(name="employee_Id")
	private Employee employee;

	
	public LeaveRecord() {
		super();
	}

	public LeaveRecord(int leaveId, Date leaveDate, Employee employee) {
		super();
		this.leaveId = leaveId;
		this.leaveDate = leaveDate;
		this.employee = employee;
	}

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public Date getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
