package com.dropdown;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multidrop {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		
		
		WebElement coffee = driver.findElement(By.name("coffee"));
		Select cof= new Select(coffee);
		//cof.selectByValue("cream");
		cof.selectByIndex(0);
		
		TakesScreenshot pravesh= (TakesScreenshot)driver;
		File Source= pravesh.getScreenshotAs(OutputType.FILE);
		File des =new File("C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Screenshot//laddu.png");
		FileUtils.copyFile(Source, des);
		
		//driver.close();
		
		
	}

}
