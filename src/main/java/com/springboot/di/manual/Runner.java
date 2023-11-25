package com.springboot.di.manual;

import com.springboot.di.commons.JavaLanguage;
import com.springboot.di.commons.Project;
import com.springboot.di.dao.EmployeeDao;
import com.springboot.di.dao.ProjectDao;

public class Runner {

	public static void main(String[] args) {
		ProjectService projectService = new ProjectService(new ProjectDao(), new EmployeeDao());
		Project spring_boot = projectService.createProject("Spring Boot", new JavaLanguage());
		projectService.assignProject(spring_boot, new JavaLanguage());
	}

}
