package com.springboot.di.dao;

import com.springboot.di.commons.Project;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 * ProjectDao, this class is used to get the project details from the database
 * @Component - this annotation is used to mark this class as a bean
 */
@Component
public class ProjectDao {

	public void save(Project project){
		System.out.println("Project saved successfully");
	}

	public List<Project> getAllUnassignedProjects(){
		return Collections.emptyList();
	}

	public List<Project> getAllAssignedProjects(){
		return Collections.emptyList();
	}

	public List<Project> getAllProjects(){
		return Collections.emptyList();
	}

}
