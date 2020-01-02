package com.andruszkow.jag.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Project {
	String shortName;
	String title;
	String description;
	Permissions permissions;
}
