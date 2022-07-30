package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_dropdown {
	public static void main(String[] args) throws Throwable {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement Create= driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
	Create.click();
	
	WebElement firstname = driver.findElement(By.xpath("//input[@aria-label='First name']"));
	firstname.sendKeys("hemalatha");
	Thread.sleep(3000);
	
	
	
	
	
	}

}
