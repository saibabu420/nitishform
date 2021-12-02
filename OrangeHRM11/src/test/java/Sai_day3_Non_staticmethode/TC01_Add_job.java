package Sai_day3_Non_staticmethode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_job  
{
	
	WebDriver driver;
	
  @Test
  public void Login ()  throws Exception
  {
  TC01_Add_job T1 = new TC01_Add_job();
 
  T1.openBrowser1();
  T1.Login();
  T1.AddQualifications1();
  
  }
  
  


	public void openBrowser1 ()  throws Exception
	  {  
  	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
	  }
	
	
	public void openBrowser ()  throws Exception
	  {  

		findElement(By.id("txtUsername")).sendKeys("Admin");
		findElement(By.id("txtPassword")).sendKeys("admin123");
		  
		findElement(By.id("btnLogin")).click();
	  }
		
	public void AddQualifications1 ()  throws Exception
	{
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_Qualifications")).click();
		findElement(By.id("menu_admin_viewSkills")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("skill_name")).sendKeys("sai");
		findElement(By.id("skill_description")).sendKeys("saidesrc");
	    findElement(By.id("btnSave")).click();  
	}
	  
	
	
    
	  
  


public  WebElement findElement(By by) throws Exception 
{

	WebElement elem = driver.findElement(by);  
	
	if (driver instanceof JavascriptExecutor) 
	{
	 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
 
	}
	return elem;
}
}