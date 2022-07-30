package com.Windowhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkTask {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.flipkart.com/");
		
	//	WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		//  login.click();
		
		WebElement name = driver.findElement(By.xpath("(//*[@type='text'])[2]"));
		name.sendKeys("9500094347");
		
    	WebElement pass = driver.findElement(By.xpath("//*[@type='password']"));
		pass.sendKeys("pravesh@04");
		
		WebElement login1 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		login1.click();
		
		WebElement tag1= driver.findElement(By.xpath("//*[text()='Grocery']"));
		Actions act = new Actions(driver);
		act.contextClick(tag1).build().perform();
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
	//	WebElement tag2= driver.findElement(By.xpath("//*[text()='Mobiles']"));
	//	act.contextClick(tag2).build().perform();
	//	robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
	//	WebElement tag3 = driver.findElement(By.xpath("//*[text()='Travel']"));
	//	act.contextClick(tag3).build().perform();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
	//	WebElement tag4 = driver.findElement(By.xpath("//*[text()='Electronics']"));
	//	act.contextClick(tag4).build().perform();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
	
		int size = driver.getWindowHandles().size();
		System.out.println("total no of windows : " +size);
		
		//parent id//
		String parname= driver.getWindowHandle();
		System.out.println("parname");
		
		System.out.println("*******************************************");
		
		Set<String> allwindow =driver.getWindowHandles();
		for (String cp : allwindow) {
			String title=  driver.switchTo().window(cp).getTitle();
			System.out.println("title");
			
			
			
		}
		

		

		
		
		
		
		
		 
		
		
		
		
	}

}
