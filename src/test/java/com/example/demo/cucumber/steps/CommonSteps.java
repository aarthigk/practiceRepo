package com.example.demo.cucumber.steps;

import com.example.demo.config.*;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.springframework.test.context.ContextConfiguration;



import io.cucumber.java.en.Given;


public class CommonSteps extends AbstractSteps {
	   @Given("^A user access \"([^\"]*)\" section of \"([^\"]*)\" application using \"([^\"]*)\" browser at version \"([^\"]*)\"$")
	    public void a_user_access_something_section_of_something_application_using_something_browser_at_version_something(String strArg1, String strArg2, String strArg3, String strArg4) throws Throwable {
		   
		   System.setProperty("webdriver.gecko.driver","src/test/java/resources/driver/geckodriver.exe");
		 
		   WebDriver driver = new FirefoxDriver();
		   
		  driver.get("https://chennaicorporation.gov.in/gcc/online-services/death-certificate");
//		   String urls="https://chennaicorporation.gov.in";
//			//	   /gcc/online-services/death-certificate";
//	   driver.get(urls);)
	//	WebElement date=	   driver.findElement(By.id("sel_day"));
		Select date = new Select(driver.findElement(By.name("sel_day")));
		date.selectByVisibleText("01");
		
		Select month = new Select(driver.findElement(By.name("sel_month")));
		month.selectByVisibleText("January");
		
		Select year = new Select(driver.findElement(By.name("sel_year")));
		year.selectByVisibleText("2005");
		
		WebElement male = driver.findElement(By.id("gender-1"));
		male.click();
		
		WebElement capta=driver.findElement(By.id("txtCaptcha_span"));
		String val=capta.getText();
		
		WebElement capValue= driver.findElement(By.id("captchavalue"));
		capValue.sendKeys(val);
		
		WebElement submit=driver.findElement(By.id("form-btn1"));
		submit.click();
		
		WebElement TogetRows = driver.findElement(By.xpath("//table[@class='tableBorder']/tbody"));
		List<WebElement>TotalRowsList = TogetRows.findElements(By.tagName("tr"));
		System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
	   }

	}

