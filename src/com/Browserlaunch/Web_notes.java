package com.Browserlaunch;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_notes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
	List<WebElement> tag1 = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
	
	
	for (WebElement w : tag1) {
		System.out.println(w.getText());
	}
	
	
	
	}
}
	
	
	
	


