package locatorinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWithXPath {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocateWithXPath lw=new LocateWithXPath();
		lw.setup_browser();
		lw.login();
	}

	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Feb 2022\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	public void login()
	{
		WebElement email = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div/input"));
		email.sendKeys("abc@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("Test1234");
	}
}
