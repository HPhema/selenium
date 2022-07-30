package com.Alert;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Alert.html");
		
        driver.manage().window().maximize();
        
        WebElement button1= driver.findElement(By.xpath("//button[contains(text(),'Aler')]"));
        button1.click();
        
        Alert a1= driver.switchTo().alert();
        a1.accept();
        Thread.sleep(5000);
        
        WebElement button2= driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
        button2.click();
        
        Alert a2= driver.switchTo().alert();
       // a2.accept();
        a2.dismiss();
        Thread.sleep(5000);
        
        WebElement button3= driver.findElement(By.xpath("//*[@onclick='confirmPrompt()']"));
        button3.click();
        Thread.sleep(2000);
        
        Alert a3= driver.switchTo().alert();
        a3.sendKeys("practice");
        a3.accept();
        Thread.sleep(2000);
        
        TakesScreenshot alert =(TakesScreenshot)driver;
        File source= alert.getScreenshotAs(OutputType.FILE);
        File des= new File("C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Screenshot//alert1.png");
        FileUtils.copyFile(source, des);
        
        
        
        
        
	}

}
