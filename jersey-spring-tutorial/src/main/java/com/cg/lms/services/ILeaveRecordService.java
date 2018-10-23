package com.cg.lms.services;

import java.util.Date;
import java.util.List;

import com.cg.lms.dto.LeaveRecord;

public interface ILeaveRecordService {

	public List<LeaveRecord> getLeaveRecordList(Date date);
	public void addLeave(LeaveRecord leaveRecord);

}
