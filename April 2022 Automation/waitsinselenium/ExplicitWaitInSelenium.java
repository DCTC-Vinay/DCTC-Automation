package waitsinselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitInSelenium {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExplicitWaitInSelenium e=new ExplicitWaitInSelenium();
		e.setup_browser();
		e.explicit_wait();
	}
	
	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ip-slim-3\\eclipse-workspace\\DCTC DEC-21\\April 22 Automation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dynamic-properties");
	}
	
	public void explicit_wait()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
		
		WebElement btn_visible=driver.findElement(By.id("visibleAfter"));
		System.out.println(btn_visible.getText());
	}

}
