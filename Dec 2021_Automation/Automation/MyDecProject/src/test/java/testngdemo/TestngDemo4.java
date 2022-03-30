package testngdemo;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo4 {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite TestngDemo4");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class TestngDemo4");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method TestngDemo4");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test TestngDemo4");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test Case 1 TestngDemo4");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test Case 2 TestngDemo4");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test TestngDemo4");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class TestngDemo4");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method TestngDemo4");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite TestngDemo4");
	}
	
}






