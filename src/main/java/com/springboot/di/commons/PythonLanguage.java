package com.springboot.di.commons;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * PythonLanguage, implements Language interface
 * @Component - this annotation is used to mark this class as a bean
 * @Profile("python") - this annotation is used to activate this bean only when the profile is set to python
 */


@Profile("python")
@Component
public class PythonLanguage implements Language {

	private String languageName;

	@Override
	public String languageName() {
		return "Python";
	}

}
