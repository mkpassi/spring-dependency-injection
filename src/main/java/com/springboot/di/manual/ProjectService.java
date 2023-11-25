package com.springboot.di.manual;

import com.springboot.di.commons.Employee;
import com.springboot.di.commons.Language;
import com.springboot.di.commons.Project;
import com.springboot.di.dao.EmployeeDao;
import com.springboot.di.dao.ProjectDao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ProjectService {

	private final ProjectDao projectDao;
	private final EmployeeDao employeeDao;

	public ProjectService(ProjectDao projectDao, EmployeeDao employeeDao) {
		this.projectDao = projectDao;
		this.employeeDao = employeeDao;
	}

	public Project createProject(String projectName, Language language){
		Project project = new Project(UUID.randomUUID(), projectName,language, false);
		projectDao.save(project);
		return project;
	}

	public void assignProject(Project project, Language language){
		List<Employee> allEmployeesByLanguage = employeeDao.getAllEmployeesByLanguage(language.languageName());
		Optional<Employee> employee = allEmployeesByLanguage.stream().filter(emp -> emp.getProjects().size() < 2)
						.findFirst();
		if(employee.isPresent()){
			employee.get().getProjects().add(project);
			project.setAssigned(true);
			project.setProjectLanguage(language);
			projectDao.save(project);
		}   else{
			System.out.println("No employees found for language: "+ language.languageName());
		}
	}



}
