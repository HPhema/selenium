package com.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_demo {
	  public static void main(String[] args) {
		 
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		  
		  WebDriver driver= new ChromeDriver();
		  
		  driver.get("http://www.leafground.com/pages/Dropdown.html");
		  
		  driver.manage().window().maximize();
		  
		  WebElement textbox1= driver.findElement(By.id("dropdown1"));
		  Select box1= new Select(textbox1);
		  box1.selectByIndex(1);
		  
		  WebElement textbox2= driver.findElement(By.name("dropdown2"));
		  Select box2= new Select(textbox2);
		  box2.selectByVisibleText("Appium");
		  
		  WebElement textbox3= driver.findElement(By.id("dropdown3"));
		  Select box3= new Select(textbox3);
		  box3.selectByValue("3");
		  
		  WebElement textbox4= driver.findElement(By.className("dropdown"));
		  textbox4.sendKeys("Loadrunner");
		  
		 
		  
		  
		  
		//  boolean multiple = box6.isMultiple();
		 // System.out.println(multiple);
		  
		  
		  
		  
	}

}  
