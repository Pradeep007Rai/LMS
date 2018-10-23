package com.cg.lms.services;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lms.dao.ILeaveRecordDao;
import com.cg.lms.dto.LeaveRecord;

@Service("leaveRecordService")
@Transactional
public class LeaveRecordService implements ILeaveRecordService {

	
	@Autowired
	private ILeaveRecordDao leaveRecordDao;

	@Override
	public List<LeaveRecord>getLeaveRecordList(Date date) {
		
		return leaveRecordDao.getLeaveRecordList(date);
	}
	
	public void addLeave(LeaveRecord leaveRecord)
	{
		leaveRecordDao.addLeave(leaveRecord);
	}
}
