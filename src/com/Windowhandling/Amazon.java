package com.Windowhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws AWTException, Throwable {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		Robot robo = new Robot();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("amazon.in");
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//*[@aria-level='3']")).click();
		
		WebElement tag1 = driver.findElement(By.xpath("//*[text()='Mobiles']"));
		act.contextClick(tag1).build().perform();
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement tag2 = driver.findElement(By.xpath("(//*[text()='Customer Service'])[1]"));
		act.contextClick(tag2).build().perform();
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement tag3 = driver.findElement(By.xpath("(//*[text()='Fashion'])[1]"));
		act.contextClick(tag3).build().perform();
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement tag4 = driver.findElement(By.xpath("(//*[text()='Best Sellers'])[1]"));
		act.contextClick(tag4).build().perform();
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		
		//size
		int size = driver.getWindowHandles().size();
		System.out.println("total no of windows : " +size);
		System.out.println("************************************************");
		
		//parent id
	    String mom = driver.getWindowHandle();
	    System.out.println(mom);
	    System.out.println("************************************************");
	    
	    // all titles
	    Set<String> allwindow = driver.getWindowHandles();
	    for (String cp : allwindow) {
	    	String Title =driver.switchTo().window(cp).getTitle();
	    	System.out.println("All window title : " +Title);
	    }	
	    
	    String Actual ="Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids";
	    for (String cp : allwindow) {
	    	if(driver.switchTo().window(cp).getTitle().equals(Actual)) {
	    	break;
			}
	    }
	    WebElement fashion1 = driver.findElement(By.id("twotabsearchtextbox"));
	      fashion1.sendKeys("adidas shoes for men");
	      Thread.sleep(2000);
	      WebElement btn2= driver.findElement(By.id("nav-search-submit-button"));
	      btn2.click();
	      Thread.sleep(2000);

	      js.executeScript("window.scrollBy(0,2000);");
	      Thread.sleep(3000);
	      js.executeScript("window.scrollBy(0,-2000);");
	      Thread.sleep(3000);
	      
	      TakesScreenshot screen1 =(TakesScreenshot) driver;
	      File source =screen1.getScreenshotAs(OutputType.FILE);
	      File des = new File("C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Screenshot//screen1.png");
	      FileUtils.copyFile(source, des);

		    String Actual1 ="Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online ";
		    for (String cp : allwindow) {
		    	if(driver.switchTo().window(cp).getTitle().equals(Actual1)) {
		    	break;
		    	}
		    }
		       
   WebElement fashion = driver.findElement(By.id("twotabsearchtextbox"));
   fashion.sendKeys("oneplus");
   Thread.sleep(2000);
   WebElement btn1= driver.findElement(By.id("nav-search-submit-button"));
   btn1.click();
   Thread.sleep(2000);
   
   JavascriptExecutor js1 = (JavascriptExecutor) driver;
   js1.executeScript("window.scrollBy(0,document.body.scrollheight)","");
   Thread.sleep(3000);
   js1.executeScript("window.scrollBy(0,0);");
   Thread.sleep(3000);
 
   TakesScreenshot screen2 =(TakesScreenshot) driver;
   File source1 =screen2.getScreenshotAs(OutputType.FILE);
   File dest = new File("C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Screenshot//screen2.png");
   FileUtils.copyFile(source1, dest);

   
   for (String cp : allwindow) {
	   if(!cp.equals(mom)) {
		   driver.switchTo().window(cp);
		   driver.close();
	   }
	
}
			
		}
			
		}
		
		
		
		
		

		
		
	
		
		
	


