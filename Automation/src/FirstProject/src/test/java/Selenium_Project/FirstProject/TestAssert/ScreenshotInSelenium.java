package Selenium_Project.FirstProject.TestAssert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotInSelenium {
	
	@Test(invocationCount = 2)
	public void takeScreenshot() throws IOException
	{
		String basePath = System.getProperty("user.dir");
		String actualPath = basePath + "\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualPath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");
		
		Date d=new Date();
		
		SimpleDateFormat tt=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		
		File scrShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrShot, new File("C:\\Users\\ip-slim-3\\eclipse-workspace\\FirstProject\\Screenshot\\Test22120 "+tt.format(d)+".png"));
		driver.close();
	}
}
