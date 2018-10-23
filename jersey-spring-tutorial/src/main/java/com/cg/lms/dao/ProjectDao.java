package com.cg.lms.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.lms.dto.Project;


@Repository
public class ProjectDao implements IProjectDao {
	@PersistenceContext
	EntityManager entityManager;

	public List<Project> getProjectList() {
		List<Project> projects = null;
		TypedQuery<Project> query = entityManager.createNamedQuery("getAllProjects", Project.class);
		projects=query.getResultList();
		return projects;
	}
}
