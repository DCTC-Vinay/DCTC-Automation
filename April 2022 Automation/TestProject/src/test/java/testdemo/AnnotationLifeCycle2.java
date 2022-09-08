package testdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationLifeCycle2 {
	
	@BeforeSuite
	public void before_suite()
	{
		System.out.println("In before Suite of Annotation2");
	}
	@BeforeClass
	public void before_class()
	{
		System.out.println("In Before Class of Annotation2");
	}
	@BeforeMethod
	public void before_method()
	{
		System.out.println("In Before Method2");
	}
	
	@BeforeTest
	public void before_test()
	{
		System.out.println("In Before Test Annotation2");
	}
	
	@Test
	public void test()
	{
		System.out.println("Inside Test Method Annotation2");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Inside Test1 Method Annotation2");
	}
	
	@AfterTest
	public void after_test()
	{
		System.out.println("In After Test Annotation2");
	}
	
	@AfterMethod
	public void after_method()
	{
		System.out.println("In After Method Annotation2");
	}
	
	@AfterClass
	public void after_class()
	{
		System.out.println("In After Class of Annotation2");
	}
	@AfterSuite
	public void after_suite()
	{
		System.out.println("In After Suite of Annotation2");
	}
}
