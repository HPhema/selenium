package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_demo {
     public static void main(String[] args) throws Throwable {
		
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
    	 
    	 WebDriver driver= new ChromeDriver();
    	 driver.get("https://www.facebook.com/");
    	 driver.manage().window().maximize();
    	 	 
    //	 WebElement newacc= driver.findElement(By.xpath(("(//a[@role='button'])[2]")));  
    	// newacc.click();
    	 
    	//WebElement username= driver.findElement(By.xpath("//input[@placeholder='First name']"));
    	// username.sendKeys("hemalatha");
    	 
    	 WebElement surname = driver.findElement(By.xpath("//*[@aria-label='Surname']"));
    	 surname.sendKeys("palani");
    	 
    	 WebElement mobile= driver.findElement(By.name("reg_email__"));
    	 mobile.sendKeys("9789009831");
    	 
    	 WebElement password = driver.findElement(By.id("password_step_input"));
    	 password.sendKeys("pravesh@04");
    	 
    	 
    	 
    	 
    	 
    	 //driver.close();
    	 
    	 
	}
}


// WebElement textbox3= driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']"));  
// textbox3.sendKeys("smartharimech007@gmail.com");
 //Thread.sleep(2000);
 
// WebElement textbox2=driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
 //textbox2.sendKeys("praveshhari");
 //Thread.sleep(2000);
 
// WebElement login_btn= driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
 //login_btn.click();
 

