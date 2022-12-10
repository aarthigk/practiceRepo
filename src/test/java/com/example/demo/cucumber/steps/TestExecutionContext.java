package com.example.demo.cucumber.steps;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

/**
 * @author gkaar
 * Defining a bean with singleton scope means the container creates a single
 * instance of that bean, and all requests for that bean name will return the
 * same object. This in essence will hold the state of our test while under
 * execution
 */
@Scope(scopeName = "SCOPE_SINGLETON", proxyMode = ScopedProxyMode.DEFAULT)
public class TestExecutionContext {

	// a var to hold our webdriver instance
	WebDriver driver;
	// a var to hold our application under test
	String application;
	// a var to hold our section (page) under test
	String section;
	// This annotation allows Spring to resolve and inject collaborating beans into
	// your bean.
	@Autowired
	private Map<String, String> propositionsUrls;
	


	
	public void setApplication(String application) {
		this.application = application;
	}

	public void setSection(String section) {
		// TODO Auto-generated method stub
		this.section = section;
	}

	public void setDriver(WebDriver driver) {
		// TODO Auto-generated method stub
		this.driver =driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
}
