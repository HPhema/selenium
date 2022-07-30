package com.insta;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class instagram {
	public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
		 
		 WebDriver driver= new EdgeDriver();
		 driver.get("https://www.instagram.com/");
		 
				 
		// driver.navigate().to("https://www.facebook.com/");
		 driver.manage().window().maximize();

		 
		// driver.navigate().forward();
		 
		 //driver.navigate().back();/html/body/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[1]/div/label/input
		 
		// driver.navigate().refresh();
		 
	     WebElement box2= driver.findElement(By.xpath("//html/body/div/section/main/article/div[2]/div/div[2]/form/div/div/div/label/input"));
		 box2.sendKeys("dhoni_hari7");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 
		 
	     WebElement box1=  driver.findElement(By.xpath("//input[@type='password']"));
	     box1.sendKeys("Hari@402");	 
	     
	     
	     WebElement box3= driver.findElement(By.xpath("//html/body/div/div[2]/div/div/div[2]/div[2]/form/div/div[3]/button"));
	     box3.click();
	     
	     
	     driver.close();
	     
	    // /html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[3]/button
	    		//html/body/div/div[2]/div/div/div[2]/div[2]/form/div/div[3]/button
	     
	     
	     
		 
		 
		 
	}

}
