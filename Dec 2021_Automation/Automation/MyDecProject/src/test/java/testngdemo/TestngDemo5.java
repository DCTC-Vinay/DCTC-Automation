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

public class TestngDemo5 extends TestngDemo4 {
	
	
	@BeforeClass
	public void beforeClassTestDemo5()
	{
		System.out.println("Before Class");
	}
		
	@Test
	public void test1TestDemo5()
	{
		System.out.println("Test Case 1");
	}
	
	@Test
	public void test2TestDemo5()
	{
		System.out.println("Test Case 2");
	}
	
	@AfterClass
	public void afterClassTestDemo5()
	{
		System.out.println("After Class");
	}
	
}






