package takescreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenshot {

	WebDriver driver;
	
	@BeforeMethod
	public void test_initialize()
	{
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\chromedriver.exe";
	
		System.setProperty("webdriver.chrome.driver", actual_path);
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test()
	public void verifyTitle() throws IOException, InterruptedException
	{
		Thread.sleep(3000);
		String title="Facebook : log in or sign up";
		String actual_title=driver.getTitle();
		
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\ip-slim-3\\Desktop\\Screenshot\\Test"+s.format(d)+".png"));
		
	}
	
	@Test()
	public void verifyTitle1() throws IOException, InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\ip-slim-3\\Desktop\\Screenshot\\Test"+s.format(d)+".png"));
		
	}
	
	
	@AfterMethod
	public void test_exit()
	{
		driver.close();
	}
}
