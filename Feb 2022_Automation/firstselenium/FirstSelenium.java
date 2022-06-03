package firstselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		FirstSelenium f=new FirstSelenium();
		f.setup_browser();
		f.close_browser();
	}
	
	public void setup_browser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Feb 2022\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		//driver.manage().window().minimize();
	}

	public void close_browser()
	{
		driver.close();
	}
}
