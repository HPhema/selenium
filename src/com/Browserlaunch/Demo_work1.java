package com.Browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_work1 {
	
public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	//	driver.get("https://www.swiggy.com/");
		
	//	driver.manage().window().maximize();
		
    //	WebElement location= driver.findElement(By.id("location"));
     //  location.sendKeys("17/2, siddalu street, choolai, chennai-600112");
	//	driver.get("https://www.snapdeal.com/login");
		
	//	driver.manage().window().maximize();
		
	//	WebElement email= driver.findElement(By.id("userName"));
   //		email.sendKeys("9500094347");
		
	 //   WebElement cont= driver.findElement(By.id("checkUser"));
	//	cont.click();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement firstname= driver.findElement(By.xpath("//*[@ng-model='FirstName']"));
		firstname.sendKeys("pravesh");
		
		WebElement lastname= driver.findElement(By.xpath("//*[@ng-model='LastName']"));
		lastname.sendKeys("hariharan");
		
		WebElement address= driver.findElement(By.xpath("//*[@ng-model='Adress']"));
		address.sendKeys("siddalu street, choolai");
		
		
		WebElement email1= driver.findElement(By.xpath("//*[@ng-model='EmailAdress']"));
		email1.sendKeys("hemalathasoniya17@gmail.com");
		
		WebElement phone= driver.findElement(By.xpath("//*[@ng-model='Phone']"));
		phone.sendKeys("9600586730");
		
		WebElement gender = driver.findElement(By.xpath("//*[@value='Male']"));
		gender.click();
		
		WebElement hobby = driver.findElement(By.id("checkbox1"));
		hobby.click();
		
		WebElement lang= driver.findElement(By.id("msdd"));
		lang.sendKeys("sowrashtra");
	
	
		
	   // driver.get("https://adactinhotelapp.com/");
		//driver.manage().window().maximize();
		
		
	  //  WebElement user= driver.findElement(By.id("username"));
	//	user.sendKeys("dhoni_hari");
		
	//	WebElement pass= driver.findElement(By.id("password"));
		//pass.sendKeys("hari@4020");
		
	//	WebElement button= driver.findElement(By.id("login"));
	//	button.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}
