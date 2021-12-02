package Day4_Static_methode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Login_StaticTest {
	
static	WebDriver driver;
  @Test
  public  void Logintest()  throws Exception
   {
	  
	  
	  TC01_Login_StaticTest.OpenBrowser();
	  TC01_Login_StaticTest.Login();
	  TC01_Login_StaticTest.Add_Nationalities();
	  TC01_Login_StaticTest.CloseBrowser();
	  
	  
   }  
	 
  
	


public static void OpenBrowser ()  throws Exception
  
  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;	
	driver.get("https://opensource-demo.orangehrmlive.com/");
}
public static void Login  ()  throws Exception
  
  {

	findElement(By.id("txtUsername")).sendKeys("Admin");
	findElement(By.id("txtPassword")).sendKeys("admin123");
	findElement(By.id("btnLogin")).click();

	
}

public static void Add_Nationalities  ()  throws Exception

{
	findElement(By.id("menu_admin_viewAdminModule")).click();
	findElement(By.id("menu_admin_nationality")).click();
	findElement(By.id("btnAdd")).click();
	findElement(By.id("nationality_name")).sendKeys("Indian794");
	findElement(By.id("btnSave")).click();
}

public static void Add_Nationalities  ()  throws Exception
{

	driver.quit();
}


public static  WebElement findElement(By by) throws Exception 
{

	WebElement elem = driver.findElement(by);  
	
	if (driver instanceof JavascriptExecutor) 
	{
	 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
 
	}
	return elem;
}


}