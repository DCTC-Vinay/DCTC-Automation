package selectclassinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMultipleInSelenium {

	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SelectClassMultipleInSelenium s=new SelectClassMultipleInSelenium();
		s.setup_browser();
		s.locate_dropdown();
	}

	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Feb 2022\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");
	}
	
	public void locate_dropdown() throws InterruptedException
	{
		WebElement sel = driver.findElement(By.id("fruits"));
		Select s1=new Select(sel);
		
		s1.selectByValue("orange");	//take the value of value attribute from option tag
		
		Thread.sleep(3000);
		
		s1.selectByIndex(0);
		
		Thread.sleep(3000);
		
		s1.selectByVisibleText("Grape");
		
		Thread.sleep(3000);
		
		System.out.println(s1.isMultiple());
		
		s1.deselectAll();
		
		
	}
	
	public void close_browser()
	{
		driver.close();
	}
}



