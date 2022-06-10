package waitsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import selectclassinselenium.SelectClassInSelenium;

public class ImplicitWaitInSelenium {
	
WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ImplicitWaitInSelenium i=new ImplicitWaitInSelenium();
		i.setup_browser();
		i.locate_dropdown();
	}

	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Feb 2022\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/newtours/register.php");
	}
	
	public void locate_dropdown() throws InterruptedException
	{
		WebElement sel = driver.findElement(By.name("country"));
		Select s1=new Select(sel);
		
		s1.selectByVisibleText("AUSTRALIA");
		
		s1.selectByValue("ITA");	//take the value of value attribute from option tag
		
		Thread.sleep(3000);
		
		s1.selectByIndex(2);
		
		Thread.sleep(3000);
		
		System.out.println(s1.isMultiple());
	}
	
	public void close_browser()
	{
		driver.close();
	}
}
