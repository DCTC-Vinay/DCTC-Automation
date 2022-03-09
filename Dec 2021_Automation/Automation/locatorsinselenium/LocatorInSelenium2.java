package locatorsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorInSelenium2 {

	WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocatorInSelenium2 lis=new LocatorInSelenium2();
		lis.pretest();
	}
	public void pretest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browser Drivers\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		login_page(driver);
	}
	
	public void login_page(WebDriver driver)
	{
		this.driver=driver;
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("test@gmail.com");
	}
}
