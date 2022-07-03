package DCTCFeb.TestMavenFeb;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotation3 {
	
	@BeforeSuite
	public void test_before_suit()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void test_before_test()
	{
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void test_before_class()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void test_before_method()
	{
		System.out.println("Before Method");
	}
	
	@Test(invocationCount = 2)
	public void test_1()
	{
		System.out.println("Test 1");
	}
	
	@Test(priority = -1)
	public void test_2()
	{
		System.out.println("Test 2");
		//Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = {"test_2","test_1"})
	
	public void test_3()
	{
		System.out.println("Test 3");
	}
	
	
	@AfterMethod
	public void test_after_method()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void test_after_class()
	{
		System.out.println("After Class");
	}
	
	
	@AfterTest
	public void test_after_test()
	{
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void test_after_suit()
	{
		System.out.println("After Suite");
	}

}
