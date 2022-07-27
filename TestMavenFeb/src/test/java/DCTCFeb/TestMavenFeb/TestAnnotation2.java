package DCTCFeb.TestMavenFeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestAnnotation2 extends TestAnnotation3{
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/buttons");
	}
	
	@Test
	public void action_methods() throws InterruptedException
	{
		WebElement btn_double_click = driver.findElement(By.id("doubleClickBtn"));
		Actions ac=new Actions(driver);
		
		ac.moveToElement(btn_double_click).doubleClick().build().perform();
		
		WebElement btn_right_click=driver.findElement(By.id("rightClickBtn"));
		ac.moveToElement(btn_right_click).contextClick().build().perform();
		
		WebElement btn_click=driver.findElement(By.xpath("//button[starts-with(text(),'Click Me')]"));
		ac.moveToElement(btn_click).click().build().perform();
	}
	
	@Test
	public void verify_title()
	{
		String expected_title="Tools QA";
		String actual_title=driver.getTitle();
		
		//Assert.assertEquals(expected_title, actual_title);
		Assert.assertNotEquals(expected_title,actual_title);
	}
	
	@AfterMethod
	public void close_browser()
	{
		driver.close();
	}

}
