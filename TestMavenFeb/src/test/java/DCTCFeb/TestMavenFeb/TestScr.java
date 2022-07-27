package DCTCFeb.TestMavenFeb;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestScr implements ITestListener{
	
	WebDriver driver;
	
	@Test
	public void setup()
	{
		String expected_title="ToolsQA Guru99";
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
		driver.get("https://demoqa.com/webtables");
		
		String actual_title=driver.getTitle();
		Assert.assertEquals(expected_title, actual_title);
	}
	
	
	@AfterMethod
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(ITestResult.FAILURE==result.getStatus())
		{
			Date d=new Date();
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			try 
			{
				FileUtils.copyFile(scrFile, new File("C:\\Users\\ip-slim-3\\eclipse-workspace\\TestMavenFeb\\Screenshot\\"+sd.format(d)+".png"));
			} 
			catch (IOException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}

}
