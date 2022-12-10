package com.example.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestHello {
	public static void main(String[] a) {
	//	System.out.println("hi");
		
		System.setProperty("webdriver.gecko.driver","src/test/java/resources/driver/geckodriver.exe");
		 
		   WebDriver driver = new FirefoxDriver();
		   
		  driver.get("https://chennaicorporation.gov.in/gcc/online-services/death-certificate");
//		   String urls="https://chennaicorporation.gov.in";
//			//	   /gcc/online-services/death-certificate";
//	   driver.get(urls);
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
	
		String getname= TotalRowsList.toString();
		System.out.println("names are "+ getname);
		System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
		int j =0;
		for (int i=0;i< TotalRowsList.size();i++) {
			
			j++;
			System.out.println("j is "+ j);
	//	String name = driver.findElement(By.xpath("*//table/tbody/tr[1]/td[1]")).getText();
		String name=driver.findElement(By.xpath("*//table/tbody/tr" +"["+j+"]" +"/td[1]")).getText();
		
		//"*//table/tbody/tr" +"["+j+"]" +"/td[1]")
		
		if (name == "nara*") {
			System.out.println("is present");
		}
		else 
		{
			System.out.println("not present");
			
		}
		
		//System.out.println("the names are "+ name);
		
		
		}
	   }

	}


