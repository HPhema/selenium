package Project_work;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mini_project {

	public static void main(String[] args) throws Throwable {
		 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		Robot robo = new Robot();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.findElement(By.className("login")).click();
		driver.findElement(By.name("email_create")).sendKeys("sonia17@gmail.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500);");
		driver.findElement(By.name("SubmitCreate")).click();
		
		driver.findElement(By.id("id_gender1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("customer_firstname")).sendKeys("hari haran");
		driver.findElement(By.id("customer_lastname")).sendKeys("siva kumar");
		Thread.sleep(2000);
		driver.findElement(By.id("passwd")).sendKeys("asdfgh@01");
		WebElement drop1 = driver.findElement(By.id("days"));
		Select date = new Select(drop1);
	    date.selectByValue("26");
	    WebElement drop2 = driver.findElement(By.id("months"));
		Select months = new Select(drop2);
	    months.selectByValue("5");
	    WebElement drop3 = driver.findElement(By.id("years"));
	    Select year = new Select(drop3);
	    year.selectByValue("1995");
	    driver.findElement(By.id("optin")).click();
	    driver.findElement(By.id("firstname")).sendKeys("hari haran");
	    driver.findElement(By.id("lastname")).sendKeys("siva kumar");
	    driver.findElement(By.id("company")).sendKeys("super Auto forge");
	    driver.findElement(By.name("address1")).sendKeys("26/17, madurai street");
	    driver.findElement(By.id("address2")).sendKeys("avaniyapuram");
	    driver.findElement(By.name("city")).sendKeys("madurai");
	    WebElement place = driver.findElement(By.id("id_state"));
	    Select city = new Select(place);
	    city.selectByIndex('4');
	    driver.findElement(By.id("postcode")).sendKeys("00015");
	    driver.findElement(By.id("id_country")).sendKeys("United States");
	    driver.findElement(By.name("phone_mobile")).sendKeys("9874563210");
	    driver.findElement(By.name("alias")).sendKeys("16/10, choolai");
	    driver.findElement(By.id("submitAccount")).click();
	    driver.findElement(By.xpath("//*[@title='Return to Home']")).click();
	    WebElement tag1 = driver.findElement(By.xpath("(//*[@title='Women'])[1]"));
	    act.contextClick(tag1).build().perform();
	    robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		int pages = driver.getWindowHandles().size();
		System.out.println("total windows : " +pages);
		
		String parent_name = driver.getWindowHandle();
		System.out.println("unique id : " +parent_name);
		
		Set<String> allwindow = driver.getWindowHandles();
		for (String cp : allwindow) {
			String title = driver.switchTo().window(cp).getTitle();
			System.out.println("title : " +title);
		}
		
		String actual = "Women - My Store";
		for (String cp : allwindow) {
			if(driver.switchTo().window(cp).getTitle().equals(actual)) {
				break;
			}
		}
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scroll(0,1500);");
		
		driver.findElement(By.xpath("//img[@title='Printed Summer Dress']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("bigpic")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@title='Close']")).click();
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scroll(0,500);");
	//	driver.findElement(By.id("quantity_wanted")).sendKeys("");
		WebElement size = driver.findElement(By.id("group_1"));
		Select mat = new Select(size);
		mat.selectByValue("3");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//*[@title='Proceed to checkout']")).click();
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scroll(0,500);");
		driver.findElement(By.xpath("(//*[@title='Proceed to checkout'])[2]")).click();
		
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scroll(0,500);");
		driver.findElement(By.name("processAddress")).click();
		
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scroll(0,500);");
		Thread.sleep(2000);
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.name("processCarrier")).click();
		
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("window.scroll(0,500);");
		Thread.sleep(2000);
		driver.findElement(By.className("bankwire")).click();
		
		JavascriptExecutor js7 = (JavascriptExecutor) driver;
		js7.executeScript("window.scroll(0,250);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
		
		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("window.scroll(0,250);");
		TakesScreenshot mini = (TakesScreenshot) driver;
		File source = mini.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\SONY\\eclipse-workspace\\Selenium\\Screenshot//project.png");
		FileUtils.copyFile(source, des);
		
		for (String cp : allwindow) {
			if(!cp.equals(parent_name)) {
				driver.switchTo().window(cp);
				driver.close();
			}
			
		}
		
		
		
		
		
	    
	  
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
	
	}

}
