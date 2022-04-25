package testngdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch2 {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		//WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();

		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
	}
	
	@Test
	public void chrome_search() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("online course on automation",Keys.RETURN);
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@name='btnK']")).click();
	}
	
	@Test
	public void edge_search() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testng dependency for maven project",Keys.RETURN);
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}
}
