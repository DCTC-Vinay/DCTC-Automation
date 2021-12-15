package Selenium_Project.FirstProject.TestAssert;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertsInSelenium {
	
	@Test
	public void checkingTitleofWebPage()
	{
		String basePath=System.getProperty("user.dir");
		String actualPath=basePath+"\\Driver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", actualPath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		
		//driver.navigate().to("https://demoqa.com/");
		String actualTitle = driver.getTitle();
		
		System.out.println(actualTitle);
		
		String expectedTitle="Tools";
		
		assertNotEquals(actualTitle, expectedTitle);
		
		boolean verifyTitle=driver.getTitle().equalsIgnoreCase("ToolsQA");
		assertTrue("Title not Equal",verifyTitle);
		
		
	}
	
	//File f=new File("C:\\Users\\ip-slim-3\\eclipse-workspace\\FirstProject\\Driver");
	@Test(enabled=false)
	public void verifyUserCanLogin()
	{
		System.out.println("Checking Assert");
		assertTrue(true);
		
		System.out.println("Check Title of Web Page");
		assertTrue(true);
		
		System.out.println("Verifying Title of Web Page");
		assertEquals(false, false);
		
		System.out.println("Verifying assert not equal Title of Web Page");
		assertNotEquals(false, true);
		
		
		//assertNull(f);
	}
	
	
	@Test(invocationCount = 2)
	public void verifyUserCansendMail()
	{
		System.out.println("In Send Mail Test");
		assertFalse(false);
	}

}
