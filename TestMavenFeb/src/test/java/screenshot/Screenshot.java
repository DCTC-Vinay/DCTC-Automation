package screenshot;

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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Screenshot implements ITestListener{

	WebDriver driver;
	String path="";
	@Test(invocationCount = 2)
	public void setup()
	{
		path=System.getProperty("user.dir");
		String actual_path=path+"\\driver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", actual_path);
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/");
		
		String expected_title="";
		String actual_title=driver.getTitle();
		Assert.assertEquals(expected_title, actual_title);
	}
	
	@AfterMethod
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		String save_screenshot=path+"\\Screenshot\\";
		
		if(ITestResult.FAILURE==result.getStatus())
		{
			Date d=new Date();
			SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
			
			File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			try 
			{
				FileUtils.copyFile(scr, new File(save_screenshot+sd.format(d)+".png"));
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}









