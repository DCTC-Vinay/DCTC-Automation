package alertsinselenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertsInSelenium {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		AlertsInSelenium a=new AlertsInSelenium();
		a.setup_browser();
		a.testAlert();
	}
	
	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ip-slim-3\\eclipse-workspace\\DCTC DEC-21\\April 22 Automation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
	}
	
	public void testAlert() throws InterruptedException
	{
		driver.findElement(By.id("alertButton")).click();
		
		Alert a1=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(a1.getText());
		a1.accept();
	}
}





