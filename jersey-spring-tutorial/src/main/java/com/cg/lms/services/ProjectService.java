package com.cg.lms.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.cg.lms.dao.IProjectDao;
import com.cg.lms.dto.Project;

@Service("projectService")
@Transactional
public class ProjectService implements IProjectService {

	@Autowired
	private IProjectDao projectDao;


	public List<Project> getProjectList() {

		return projectDao.getProjectList();

}
	
	public IProjectDao getProjectDao() {
		return projectDao;
	}

	public void setProjectDao(IProjectDao projectDao) {
		this.projectDao = projectDao;
	}


	
	
}
