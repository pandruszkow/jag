package com.andruszkow.jag.persistence;

import com.andruszkow.jag.domain.Project;

import java.util.List;

public interface ProjectRepository {
	public void persist(Project project);

	public Project findById(int id);

	public List<Project> list();
}
