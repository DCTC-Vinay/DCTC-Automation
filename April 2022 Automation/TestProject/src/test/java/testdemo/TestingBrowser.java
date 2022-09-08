package testdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingBrowser {
	
	
	WebDriver driver;
	@BeforeMethod
	public void test_setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ip-slim-3\\eclipse-workspace\\DCTC DEC-21\\April 22 Automation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test_login()
	{
		WebElement user_email = driver.findElement(By.id("email"));
		user_email.sendKeys("vinay.salunke@gmail.com");
		
		WebElement user_pass=driver.findElement(By.id("pass"));
		user_pass.sendKeys("123456");
		
		
		WebElement btn_login=driver.findElement(By.name("login"));
		//btn_login.click();
		btn_login.submit();
	}
	
	@Test
	public void test_demo()
	{
		System.out.println("In a table");
	}
	
	@AfterMethod
	public void test_close()
	{
		driver.close();
	}

}
