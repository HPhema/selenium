package com.Browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_work {
	
	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		WebElement from= driver.findElement(By.id("src"));
		from.sendKeys("chennai");
	    Thread.sleep(3000);
				
		WebElement to= driver.findElement(By.id("dest"));
	    to.sendKeys("bangalore");
	    Thread.sleep(3000);
	
	    
	    driver.get("https://www.icicibank.com/openLI");
		driver.manage().window().maximize();
		
		WebElement userid= driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
		userid.sendKeys("164849236");
		
		WebElement pass =driver.findElement(By.name("AuthenticationFG.ACCESS_CODE"));
		pass.sendKeys("pravesh@04");
		
	
		driver.get("https://www.google.com/");
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("greens technology");
			
		WebElement button1= driver.findElement(By.xpath("(//input[@aria-label='Google Search'])[2]"));
	    button1.click();
			
	
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		
	    WebElement customerid= driver.findElement(By.xpath("//input[@type='text']"));
		customerid.sendKeys("212995");
		
}
}
