package navigationmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethodsInSelenium {

	
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		NavigationMethodsInSelenium n=new NavigationMethodsInSelenium();
		n.setup_browser();
		n.navigate();
	}
	
	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ip-slim-3\\eclipse-workspace\\DCTC DEC-21\\April 22 Automation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	public void navigate() throws InterruptedException
	{
		driver.findElement(By.partialLinkText("Forgotten")).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.google.com/");
	}

}
