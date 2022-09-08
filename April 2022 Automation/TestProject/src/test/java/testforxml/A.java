package testforxml;

import org.testng.annotations.Test;

public class A {

	@Test(invocationCount = 5)
	public void test_setup()
	{
		System.out.println("In a Class A Test Setup");
	}
	
	@Test
	public void test_close()
	{
		System.out.println("In a Class A Test Close");
	}
}
