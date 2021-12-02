package Sai_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_jobs    
{
  
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("http://demowebshop.tricentis.com/jewelry");
	  
		
	
		  
		driver.findElement(By.id("ico-register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("chintapalli");
		driver.findElement(By.id("lastName")).sendKeys("saibabu");

		driver.findElement(By.id("Email")).sendKeys("chintapallisaibabu07@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("saibabu");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("saibabu123");
		driver.findElement(By.id("register-button")).click();
		
		
		
		

	  
  }


}



