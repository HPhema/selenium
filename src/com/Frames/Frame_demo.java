package com.Frames;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_demo {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement btn1 = driver.findElement(By.id("Click"));
		btn1.click();
		Thread.sleep(2000);
		
		System.out.println(btn1.getText());
		 
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		
		driver.switchTo().frame("frame2");
		
		WebElement btn2=driver.findElement(By.id("Click1"));
		btn2.click();
		Thread.sleep(2000);
		System.out.println(btn2.getText());
		
		driver.switchTo().defaultContent();
		
		
		TakesScreenshot frame= (TakesScreenshot)driver;
		File source= frame.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Screenshot//frame.png");
		FileUtils.copyFile(source, des);
		

		
		
		
		
	}

}
