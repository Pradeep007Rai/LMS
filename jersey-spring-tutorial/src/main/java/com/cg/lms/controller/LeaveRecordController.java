package com.cg.lms.controller;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cg.lms.dto.ApplyLeave;
import com.cg.lms.dto.Employee;
import com.cg.lms.dto.LeaveRecord;
import com.cg.lms.services.IEmployeeService;
import com.cg.lms.services.ILeaveRecordService;

@Controller
@Path("leaveRecord")
public class LeaveRecordController {
	
	@Autowired
	ILeaveRecordService leaveRecordService;
	
	@Path("get/{date}")
	@GET
    //@Produces(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
   // public List<LeaveRecord> getLeaves(ApplyLeave leave)
	 public String getLeaves(@PathParam("date")Date date)
	{
		
		//Date date=leave.getSelectedDate();
		
/*		List<LeaveRecord> leaveRecords = leaveRecordService.getLeaveRecordList(date);
		for (Iterator iterator = leaveRecords.iterator(); iterator.hasNext();) {
			LeaveRecord leaveRecord = (LeaveRecord) iterator.next();
			leaveRecord.getEmployee().setLeaveRecords(null);
			leaveRecord.getEmployee().getProject().setEmployeeList(null);;
		}
      return leaveRecords;*/
		//return date.toString();
		return date.toString();
    }
	
	
	@Path("add")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String addLeave(ApplyLeave leave)
	{
		LeaveRecord addleave = new LeaveRecord();
		addleave.setLeaveDate(leave.getSelectedDate());
		addleave.setEmployee(leave.getEmployee());
		
		
		leaveRecordService.addLeave(addleave);
		System.out.println(addleave.getLeaveDate());
		return addleave.getLeaveDate().toString()+addleave.getEmployee().getEmployeeId();
	}

}
