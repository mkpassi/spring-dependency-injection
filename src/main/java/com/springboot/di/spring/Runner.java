package com.springboot.di.spring;

import com.springboot.di.commons.Language;
import com.springboot.di.commons.Project;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = getSpringContext("python");
		ProjectService projectService =  context.getBean(ProjectService.class);
		Language language = context.getBean(Language.class);
		Project spring_boot = projectService.createProject("Spring Boot", language);
		projectService.assignProject(spring_boot, language);
		context.close();
	}


	private static AnnotationConfigApplicationContext getSpringContext(String profile) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles(profile);
		context.register(Configuration.class);
		context.refresh();
		return context;
	}

}
