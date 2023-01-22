package guru99roject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Login{
  
	public WebDriver driver;
	public String path = "";
	public String actual_path = "";
	public String file_path="";
	public String actual_file_path="";
	public String uid="";
	public String pwd="";
	public String url="";
	
	public String expected_home="Guru99 Bank Manager HomePage";
	public String actual_home="";
	
	public LoadProperties l_data;
	public LoadProperties l_locate;
	
	
	@BeforeMethod
	public void setUp() throws Exception {

		// Get current working directory and load data file
		
		file_path=System.getProperty("user.dir");
		actual_file_path=file_path+"\\Resource\\Login.properties";
		
		l_data = new LoadProperties(actual_file_path);
		
		// Create a new instance of the Chrome driver
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/index.php");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	@Test
	public void test_login() throws InterruptedException
	{
		// Get current working directory and load data file
		l_locate=new LoadProperties(actual_file_path);
		uid=l_locate.getData("login_ID");
		pwd=l_locate.getData("login_pwd");
		
		driver.findElement(By.name("uid")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(pwd);
		
		driver.findElement(By.name("btnLogin")).submit();
		
		actual_home=driver.getTitle();
		
		Assert.assertEquals(expected_home, actual_home);
	}
	
	@AfterMethod
	public void close_browser()
	{
		driver.close();
	}
}