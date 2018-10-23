package com.cg.lms.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cg.lms.dto.Employee;
import com.cg.lms.dto.Project;
import com.cg.lms.services.IProjectService;

@Controller
@Path("/project")
public class ProjectController {
	
	
	@Autowired
	private IProjectService projectService;
	
	@Path("/getList")
	@GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public List<Project> getIt() {
		List<Project> projectList = projectService.getProjectList();
		for (Iterator<Project> iterator = projectList.iterator(); iterator.hasNext();) {
			Project project = (Project) iterator.next();
			project.setEmployeeList(null);		
		}
		return projectList ;
	}
}
