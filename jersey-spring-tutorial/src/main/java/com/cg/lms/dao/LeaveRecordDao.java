package com.cg.lms.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.lms.dto.Employee;
import com.cg.lms.dto.LeaveRecord;
import com.cg.lms.dto.Project;

@Repository("leaveRecordDao")
@Transactional
public class LeaveRecordDao implements ILeaveRecordDao{
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<LeaveRecord> getLeaveRecordList(Date date) {
		TypedQuery<LeaveRecord> query = entityManager.createNamedQuery("getAllLeaveRecord",LeaveRecord.class);
		query.setParameter("leaveDate", date);
		return query.getResultList();
	}
	
	public void addLeave(LeaveRecord leaveRecord)
	{
		entityManager.persist(leaveRecord);
		entityManager.flush();
	}
}
