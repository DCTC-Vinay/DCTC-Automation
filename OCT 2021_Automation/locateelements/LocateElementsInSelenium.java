package locateelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocateElementsInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocateElementsInSelenium l=new LocateElementsInSelenium();
		l.setup();
	}
	
	void setup()
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // display window in maximize
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/"); // it will redirect to given URL
		
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("12345");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("test@gmail.com");

		WebElement login = driver.findElement(By.name("login"));
		login.click();

		WebElement partial_link = driver.findElement(By.partialLinkText("Forgotten"));
		partial_link.click();

		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		link.click();
	}
	
	
}
