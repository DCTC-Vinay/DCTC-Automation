package testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hello2 {

	@Test(groups = "Sanity")
	public void test()
	{
		System.out.println("Hello to Test NG");
	}
	
	@Test(groups = "Sanity")
	public void test1()
	{
		System.out.println("Hello to Test NG Test 1");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnGroups = "Sanity")
	public void test2()
	{
		System.out.println("Hello to Test NG Test 2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Hello to Test NG Test 3");
	}
}