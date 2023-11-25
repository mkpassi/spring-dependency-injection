package com.springboot.di.dao;

import com.springboot.di.commons.Employee;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 *  EmployeeDao, this class is used to get the employee details from the database
 *  @Component - this annotation is used to mark this class as a bean
 */

@Component
public class EmployeeDao {

	public List<Employee> getAllJavaLanguageEmployees(){
		return Collections.emptyList();
	}

	public List<Employee> getAllDotNetLanguageEmployees(){
		return Collections.emptyList();
	}

	public List<Employee> getAllEmployees(){
		return Collections.emptyList();
	}

	public List<Employee> getAllPythonLanguageEmployees(){
		return Collections.emptyList();
	}

	public List<Employee> getAllEmployeesByLanguage(String language){
		return Collections.emptyList();
	}

	public List<Employee> getEmployeesWithNoProjects(){
		return Collections.emptyList();
	}

}
