package com.example.demo.cucumber.steps;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;

import com.example.demo.config.Application;
import com.example.demo.cucumber.*;


@ContextConfiguration(classes = Application.class)
public abstract class AbstractSteps {
	
	  public String testDataPath = System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"testdata"+File.separator;
	  
	  public String getTestDataPath() {
	        return testDataPath;
	    }

	    public void setTestDataPath(String testDataPath) {
	        this.testDataPath = testDataPath;
	    }
	    
		@Value("${test.webdriver.default.browser}")
		 protected String defaultBrowser;
		@Value("${test.environment.endpoint}")
		private String endpoint;
		@Value("${test.webdriver.gecko.driver}")
		private String firefoxWebDriverPath;
		@Value("${test.webdriver.chrome.driver}")
		private String chromeDriverPath;
		
		@Autowired(required=false)
		private TestExecutionContext testExecutionContext;
		
		WebDriver driver;
		private static Platform currentPlatform = Platform.getCurrent();
		
		void configureWebDriver() {
			switch (defaultBrowser) {
				case "firefox":
//					if(currentPlatform.toString().equals("WIN")){
//						driver = WebDriverPicker.fromAlias(defaultBrowser).getDriver(firefoxWebDriverPath);
//					}else{
//						driver = WebDriverPicker.fromAlias(defaultBrowser).getDriver(firefoxWebDriverPath);
//					}
//				case "chrome":
//					if(currentPlatform.toString().equals("WIN")){
//						driver = WebDriverPicker.fromAlias(defaultBrowser).getDriver(chromeDriverPath);
//					}else{
//						System.out.println(currentPlatform);
//						driver = WebDriverPicker.fromAlias(defaultBrowser).getDriver(chromeDriverPath);
//					}

			}
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			testExecutionContext.setDriver(driver);
		}
		
		
		WebDriver getDriver() {
			return this.testExecutionContext.getDriver();
		}
		
//		Page getPage() {
//			return this.testExecutionContext.getPage();
//		}


		public void declareApplicationUnderTest(String application) {
			this.testExecutionContext.setApplication(application);
		}

		public void declareApplicationAndSectionUnderTest(String application, String section) {
			this.testExecutionContext.setApplication(application);
			this.testExecutionContext.setSection(section);
		}

		public void declareSectionUnderTest(String section) {
			this.testExecutionContext.setSection(section);
		}
}
