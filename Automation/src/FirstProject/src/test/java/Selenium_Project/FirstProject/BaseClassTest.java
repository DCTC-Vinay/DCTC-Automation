package Selenium_Project.FirstProject;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClassTest {

	@Test
	public void baseTest()
	{
		System.out.println("Test Method of Base  Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method Annotation  Class");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method Annotation  Class");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class Annotation  Class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class Annotation Class");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test Annotation of  Class");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test Annotation of Class");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suit Annotation of Class");
	}

	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suit Annotation of Class");
	}
}
