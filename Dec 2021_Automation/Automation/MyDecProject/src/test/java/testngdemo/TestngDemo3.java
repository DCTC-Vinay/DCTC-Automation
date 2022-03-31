package testngdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo3 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void test_initialize()
	{
		System.out.println("in Initialize method");
		
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\chromedriver.exe";
	
		System.setProperty("webdriver.chrome.driver", actual_path);
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void verifyTitle()
	{
		String title="Facebook : log in or sign up";
		String actual_title=driver.getTitle();
		
		Assert.assertEquals(actual_title,title);	//Test Case will be marked as Passed if both values are same otherwise Failed
	}
	
	@Test
	public void verifyTitle2()
	{
		String title="Facebook : log in or sign up";
		String actual_title=driver.getTitle();
		
		Assert.assertEquals(actual_title,title);	//Test Case will be marked as Passed if both values are same otherwise Failed
	}
	
	@AfterMethod
	public void test_exit()
	{
		System.out.println("On Exit Test");
		driver.close();
	}
	
	
}





