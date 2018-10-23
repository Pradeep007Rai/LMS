package com.cg.lms.dao;

import java.util.Date;
import java.util.List;

import com.cg.lms.dto.LeaveRecord;

public interface ILeaveRecordDao {

	public List<LeaveRecord> getLeaveRecordList(Date date);
	public void addLeave(LeaveRecord leaveRecord);

}
