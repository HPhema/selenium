package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_amazon {
	public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		 
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		 driver.manage().window().maximize();
		 
		 WebElement find = driver.findElement(By.xpath("//input[@dir='auto']"));
		 find.sendKeys("adidas shoes");
		 Thread.sleep(2000);	
		 
		 
		 WebElement btn= driver.findElement(By.id("nav-search-submit-button"));
		 btn.click();
		 Thread.sleep(2000);
		 
		 
		// driver.close();
		 
		 
		 
	}

}
