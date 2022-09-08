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

public class AnnotationLifeCycle {
	
	@BeforeSuite
	public void before_suite()
	{
		System.out.println("In before Suite of Annotation1");
	}
	
	@BeforeClass
	public void before_class()
	{
		System.out.println("In Before Class of Annotation");
	}
	@BeforeMethod
	public void before_method()
	{
		System.out.println("In Before Method");
	}
	
	@BeforeTest
	public void before_test()
	{
		System.out.println("In Before Test");
	}
	
	@Test
	public void test()
	{
		System.out.println("Inside Test Method");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Inside Test1 Method");
	}
	
	@AfterTest
	public void after_test()
	{
		System.out.println("In After Test");
	}
	
	@AfterMethod
	public void after_method()
	{
		System.out.println("In After Method");
	}
	
	@AfterClass
	public void after_class()
	{
		System.out.println("In After Class of Annotation");
	}
	
	@AfterSuite
	public void after_suite()
	{
		System.out.println("In after Suite of Annotation1");
	}
}
