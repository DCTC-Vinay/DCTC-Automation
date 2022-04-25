package testngdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstInTestNG {

	WebDriver driver;
	@Test
	public void a_setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(3000);
	}
	
	@Test
	public void exit()
	{
		driver.close();
	}
}
