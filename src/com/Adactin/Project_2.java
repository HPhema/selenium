package com.Adactin;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project_2 {
	public static void main(String[] args) throws Throwable {
		
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://adactinhotelapp.com/index.php");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		 Robot robo = new Robot();
		
		 driver.findElement(By.id("username")).sendKeys("hemalathasoniya");
		 driver.findElement(By.id("password")).sendKeys("pravesh@04");
		 driver.findElement(By.id("login")).click();
		 
		 WebElement location1 = driver.findElement(By.name("location"));
		 Select s1= new Select(location1);
		 s1.selectByValue("London");
		 
		 WebElement hotels = driver.findElement(By.id("hotels"));
		 Select s2= new Select(hotels);
		 s2.selectByValue("Hotel Sunshine");
		 
		 WebElement rooms = driver.findElement(By.id("room_type"));
		 Select s3 = new Select(rooms);
		 s3.selectByValue("Super Deluxe");
		 
		 WebElement roomno= driver.findElement(By.id("room_nos"));
		 Select s4 = new Select(roomno);
		 s4.selectByVisibleText("2 - Two");
		 
		 driver.findElement(By.id("datepick_in")).sendKeys("06/07/2022");
		 driver.findElement(By.id("datepick_out")).sendKeys("08/07/2022");
		 
		 WebElement adult = driver.findElement(By.id("adult_room"));
		 Select s5 = new Select (adult);
		 s5.selectByValue("2");
		 
		 WebElement children = driver.findElement(By.id("child_room"));
		 Select s6 = new Select (children);
		 s6.selectByValue("1");
		 
		 driver.findElement(By.id("Submit")).click();
		 
		 driver.findElement(By.id("radiobutton_0")).click();
		 driver.findElement(By.id("continue")).click();
		 driver.findElement(By.id("first_name")).sendKeys("hariharan");
		 driver.findElement(By.id("last_name")).sendKeys("siva kumar");
		 driver.findElement(By.id("address")).sendKeys("16/10, astabujam 1st road,choolai");
		 driver.findElement(By.id("cc_num")).sendKeys("1236547893021598");
		  
		 WebElement type = driver.findElement(By.id("cc_type"));
		 Select s7 = new Select(type);
		 s7.selectByValue("VISA");
		 
		 WebElement expiry = driver.findElement(By.id("cc_exp_month"));
		 Select s8 = new Select (expiry);
		 s8.selectByVisibleText("December");
		 
		 WebElement year = driver.findElement(By.id("cc_exp_year"));
		 Select s9 = new Select (year);
		 s9.selectByValue("2022");
		 
		 driver.findElement(By.id("cc_cvv")).sendKeys("123");
		 driver.findElement(By.id("book_now")).click();
		 
		 robo.keyPress(KeyEvent.VK_CONTROL);
		 robo.keyPress(KeyEvent.VK_MINUS);
		 robo.keyRelease(KeyEvent.VK_CONTROL);
		 robo.keyRelease(KeyEvent.VK_MINUS);
		 Thread.sleep(2000);
		 robo.keyPress(KeyEvent.VK_CONTROL);
		 robo.keyPress(KeyEvent.VK_MINUS);
		 robo.keyRelease(KeyEvent.VK_CONTROL);
		 robo.keyRelease(KeyEvent.VK_MINUS);
		 Thread.sleep(2000);
		 
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,250);");
		 Thread.sleep(5000);
		 
		 TakesScreenshot booking = (TakesScreenshot) driver;
		 File source = booking.getScreenshotAs(OutputType.FILE);
		 File dest = new File("C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Screenshot//bookings.png");
		 FileUtils.copyFile(source, dest);
		 Thread.sleep(5000);
		 
		 driver.findElement(By.id("logout")).click();
		 Thread.sleep(5000);
		 driver.close();

}
	
}
