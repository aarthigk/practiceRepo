package com.example.demo.config;

/**
* @author Gk Aar
*/

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.DefaultResourceLoader;

import com.example.demo.cucumber.steps.TestExecutionContext;



@SpringBootApplication
@Configuration
@PropertySource("classpath:application.${environment:local}.properties")
@ComponentScan(basePackages = { "com.example.demo" })
public class Application {

	// user interface mappings
	@Value("${test.propositions.ajio.base.url}")
	private String ajioBaseUrl;
	@Value("${test.propositions.flipk.base.url}")
	private String flipKartBaseUrl;


	@Bean
	TestExecutionContext testExecutionContext() {
		return new TestExecutionContext();
	}

	@Bean
	Map<String, String> propositionsUrls() {
		Map<String, String> answer = new HashMap<>();
		answer.put("ajio", ajioBaseUrl);
		answer.put("FK", flipKartBaseUrl);
		return answer;
	}


}
