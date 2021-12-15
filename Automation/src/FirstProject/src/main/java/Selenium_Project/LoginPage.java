package Selenium_Project;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	WebDriver driver;
	By user=By.name("uid");
	By pwd=By.name("password");
	By btnLogin=By.name("btnLogin");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setUserName(String strUid)
	{
		driver.findElement(user).sendKeys(strUid);
	}
	
	public void setPassword(String strPwd)
	{
		driver.findElement(pwd).sendKeys(strPwd);
	}
	
	public void clickLoginButton()
	{
		driver.findElement(btnLogin).click();
	}
	
	public void loginToPage(String strUid,String strPwd)
	{
		this.setUserName(strUid);
		this.setPassword(strPwd);
		this.clickLoginButton();
	}
	
	public void takeScreenshot() throws IOException
	{
		Date d=new Date();
		
		SimpleDateFormat tt=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		
		File scrShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrShot, new File("C:\\Users\\ip-slim-3\\eclipse-workspace\\FirstProject\\Screenshot\\Test "+tt.format(d)+".png"));
		
	}
	
	
}
