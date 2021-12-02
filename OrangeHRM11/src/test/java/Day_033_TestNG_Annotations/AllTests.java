package  Day_033_TestNG_Annotations;
//https://www.guru99.com/all-about-testng-and-selenium.html

import org.testng.annotations.*;
public class AllTests
{
	
	@BeforeSuite
	public void Test1() throws Exception {
		
		System.out.println("1  --- BeforeSuite");
	}
	
	
	@BeforeTest
	public void Test3() throws Exception {
		System.out.println("2 ....BeforeTest");
	}
	
	@BeforeClass
	public void Test2() throws Exception {
		
		System.out.println("3.....BeforeClass");
	}

	

	
	@Test
	public void Test4() throws Exception {
		System.out.println("4....@Test");
	}
	
	
	
	
	@AfterClass
	public void Test6() throws Exception {
		System.out.println("5.....AfterClass");
	}
	
	@AfterTest
	public void Test5() throws Exception {
		System.out.println("6....AfterTest");
	}
	
	
	@AfterSuite
	public void Test7() throws Exception {
		
		System.out.println("7....AfterSuite");
	}
		
	
	@BeforeMethod
	public void Test8() throws Exception {
		System.out.println("99....BeforeMethod");
	}
	
	@AfterMethod
	public void Test9() throws Exception {
		
		System.out.println("100....AfterMethod");
	}
	
	
}                                                  












