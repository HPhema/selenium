package com.Browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.youtube.com/");
		 driver.manage().window().maximize();
		 
		 WebElement search= driver.findElement(By.name("search_query"));
	     search.sendKeys("java tutorial");
	     Thread.sleep(2000);
	     
	     WebElement button= driver.findElement(By.id("search-icon-legacy"));
	     button.click();
		 
		 
		 //System.setProperty("webdriver.edge.driver","C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
		 //WebDriver driver1= new EdgeDriver();
		 
		// driver1.get("https://www.flipkart.com/");
		// driver1.manage().window().maximize();
		 
		// driver.close();
		 
		 
	}

}
