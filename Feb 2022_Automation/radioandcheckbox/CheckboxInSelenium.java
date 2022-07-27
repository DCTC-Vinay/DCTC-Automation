package radioandcheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxInSelenium {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CheckboxInSelenium r=new CheckboxInSelenium();
		r.setup_browser();
		r.locate_checkbox();
	}
	
	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Feb 2022\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
	}
	
	public void locate_checkbox() throws InterruptedException
	{
		WebElement check1 = driver.findElement(By.id("vfb-6-0"));
		check1.click();
		
		Thread.sleep(3000);
		
		WebElement check2=driver.findElement(By.id("vfb-6-1"));
		check2.click();
		System.out.println(check2.getAttribute("value"));
	}
	
	public void close_browser()
	{
		driver.close();
	}

}
