package com.example.demo.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
		glue = { "src/main/java/com/ishop/ajio/steps" },
		
		plugin = { "pretty", "json:target/cucumber.json" },
		// plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" },
		//format = {"pretty", "html:Reports/html", "junit:Reports/junit/junit-report.xml", "json:Reports/json/json-report.json"},
		monochrome = true,
		//tags = { "~@ignore", "@Dev" },
		//features = "classpath:features")/ishop/src/main/resource/features
		features="src/test/resource/features")
public class CukeRunner{
	
	
}