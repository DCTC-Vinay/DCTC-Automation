package testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hello {

	@Test(groups = {"Functional","Smoke"},priority=4)
	public void test()
	{
		System.out.println("Hello to Test NG");
		Assert.assertTrue(false);
	}
	
	@Test(groups = "Functional",priority = 5)
	public void test1()
	{
		System.out.println("Hello to Test NG Test 1");
	}
	
	@Test(priority = 0, invocationCount = 5)
	public void test2()
	{
		System.out.println("Hello to Test NG Test 2");
	}
	
	@Test(priority=3)
	public void test3()
	{
		System.out.println("Hello to Test NG Test 3");
	}
}