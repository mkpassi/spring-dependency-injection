package com.springboot.di.commons;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 *  JavaLanguage, implements Language interface
 *  @Component - this annotation is used to mark this class as a bean
 *  @Profile("java") - this annotation is used to activate this bean only when the profile is set to java
 */

@Profile("java")
@Component
public class JavaLanguage implements Language {

	private String languageName;

	@Override
	public String languageName() {
		return "Java";
	}
}
