package test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Selenium_Project.LoginPage;

public class TestPages {

	LoginPage login;
	WebDriver driver;
	@Test
	public void initial() throws IOException, InterruptedException
	{
		
		String basePath = System.getProperty("user.dir");
		String actualPath = basePath + "\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualPath);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V1/index.php");
	
		String actualTitle=driver.getTitle();
		String expectedTitle="GTPL Bank Home Page";
		Thread.sleep(2000);
		login =new LoginPage(driver);
		assertEquals(actualTitle, expectedTitle);
		login.takeScreenshot();
	}
	
	@Test
	public void testLogin() throws InterruptedException, IOException
	{
		login =new LoginPage(driver);
		login.loginToPage("mngr370906", "bEjuman");
		Thread.sleep(3000);
		
		String actualTitle=driver.getTitle();
		String expectedTitle="GTPL Bank Manager HomePage";
		
		assertEquals(actualTitle, expectedTitle);
		login.takeScreenshot();
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}
