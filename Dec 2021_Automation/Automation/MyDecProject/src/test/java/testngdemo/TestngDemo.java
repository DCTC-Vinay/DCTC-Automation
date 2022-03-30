package testngdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngDemo {
	
	WebDriver driver;
	
	@Test(invocationCount = 2)
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
	
	@Test(dependsOnMethods = "test_initialize")
	public void test_exit()
	{
		System.out.println("On Exit Test");
		driver.close();
	}
	
	@Test(enabled = true)
	public void test()
	{
		System.out.println("Test");
	}
}






