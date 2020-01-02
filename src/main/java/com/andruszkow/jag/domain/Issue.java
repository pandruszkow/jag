package com.andruszkow.jag.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Issue {
	Project project;
	String summary;
}
