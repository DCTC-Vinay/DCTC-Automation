package radioandcheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonInSelenium {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RadioButtonInSelenium r=new RadioButtonInSelenium();
		r.setup_browser();
		r.locate_radio();
	}
	
	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Feb 2022\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
	}
	
	public void locate_radio() throws InterruptedException
	{
		WebElement option1 = driver.findElement(By.id("vfb-7-1"));
		option1.click();
		System.out.println(option1.getText());
		Thread.sleep(3000);
		driver.findElement(By.id("vfb-7-2")).click();
	}
	
	public void close_browser()
	{
		driver.close();
	}

}
