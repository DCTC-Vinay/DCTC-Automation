package Selenium_Project.FirstProject;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BTest extends BaseClassTest {
	
	@Test
	public void method1()
	{
		System.out.println("Method 1 of B Class");
	}
	
	@Test
	public void method2()
	{
		System.out.println("Method 2 of B Class");
	}


}
