package com.springboot.di.commons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {

	private int employeeId;
	private String employeeName;
	private Language language;

	private List<Project> projects;

	public Employee(int employeeId, String employeeName, Language language) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.language = language;
		this.projects = Collections.emptyList();
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}


	@Override public String toString() {
		return "Employee{" +
						"employeeId=" + employeeId +
						", employeeName='" + employeeName + '\'' +
						", language=" + language +
						", projects=" + projects +
						'}';
	}
}
