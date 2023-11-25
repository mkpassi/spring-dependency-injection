package com.springboot.di.commons;

import java.util.UUID;

public class Project {

	private UUID projectId;
	private String projectName;
	private boolean isAssigned;

	private Language projectLanguage;

	public Project(UUID projectId, String projectName,Language language, boolean isAssigned) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.isAssigned = isAssigned;
		this.projectLanguage = language;
	}

	public void setProjectId(UUID projectId) {
		this.projectId = projectId;
	}

	public Language getProjectLanguage() {
		return projectLanguage;
	}

	public void setProjectLanguage(Language projectLanguage) {
		this.projectLanguage = projectLanguage;
	}

	public boolean isAssigned() {
		return isAssigned;
	}

	public void setAssigned(boolean assigned) {
		isAssigned = assigned;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	@Override public String toString() {
		return "Project{" +
						"projectId=" + projectId +
						", projectName='" + projectName + '\'' +
						", isAssigned=" + isAssigned +
						", projectLanguage=" + projectLanguage +
						'}';
	}
}
