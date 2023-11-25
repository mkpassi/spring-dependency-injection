package com.springboot.di.spring;

import com.springboot.di.commons.Employee;
import com.springboot.di.commons.Language;
import com.springboot.di.commons.Project;
import com.springboot.di.dao.EmployeeDao;
import com.springboot.di.dao.ProjectDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * ProjectService, this class is used to create and assign projects to employees
 * @Service - this annotation is used to mark this class as a bean
 * @Autowired - this annotation is used to inject the dependencies
 * @Qualifier - this annotation is used to specify the bean name to be injected
 * @Profile - this annotation is used to activate the bean only when the profile is set to the specified value
 * @Value - this annotation is used to inject the value from the properties file
 * @Primary - this annotation is used to specify the primary bean to be injected
 * @Lazy - this annotation is used to delay the initialization of the bean
 */

@Service
public class ProjectService {

	private final ProjectDao projectDao;
	private final EmployeeDao employeeDao;

	public ProjectService(ProjectDao projectDao, EmployeeDao employeeDao) {
		this.projectDao = projectDao;
		this.employeeDao = employeeDao;
	}

	/**
	 * createProject, this method is used to create the project
	 * @param projectName
	 * @param language
	 * @return
	 */

	public Project createProject(String projectName, Language language){
		Project project = new Project(UUID.randomUUID(), projectName,language, false);
		projectDao.save(project);
		return project;
	}

	/**
	 * assignProject, this method is used to assign the project to the employee
	 * @param project
	 * @param language
	 */

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
