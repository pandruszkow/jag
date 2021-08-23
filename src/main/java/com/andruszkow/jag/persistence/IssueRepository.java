package com.andruszkow.jag.persistence;

import com.andruszkow.jag.domain.Issue;
import com.andruszkow.jag.domain.Project;

public interface IssueRepository {
	public void save(Issue issue);

	public Issue findById(Project project, int issueNumber);
}
