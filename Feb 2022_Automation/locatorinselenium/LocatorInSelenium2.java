package locatorinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorInSelenium2 {

	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LocatorInSelenium2 li=new LocatorInSelenium2();
		li.setup_browser();
		li.login();
	//	li.close_browser();
	}
	
	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Feb 2022\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	public void login() throws InterruptedException
	{
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Test234");
		
		driver.findElement(By.name("login")).submit();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Forgotten password?")).click();
	}
	
	public void close_browser()
	{
		driver.close();
	}

}








