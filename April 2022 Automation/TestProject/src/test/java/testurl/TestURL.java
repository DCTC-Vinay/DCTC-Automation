package testurl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestURL {
	
	WebDriver driver;
	String str_current="";
	String str_expected="";
	@BeforeMethod
	public void test_setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ip-slim-3\\eclipse-workspace\\DCTC DEC-21\\April 22 Automation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test_title()
	{
		str_expected="Facebook Login Page";
		str_current=driver.getTitle();
		
		Assert.assertEquals(str_current, str_expected);
	}
	
	@AfterMethod
	public void test_close()
	{
		driver.close();
	}

}
