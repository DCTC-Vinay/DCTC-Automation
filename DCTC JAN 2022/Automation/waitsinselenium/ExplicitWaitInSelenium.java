package waitsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browser Drivers\\Chrome\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://demoqa.com/webtables");
		
		driver1.findElement(By.id("addNewRecordButton")).click();
		driver1.findElement(By.id("firstName")).sendKeys("test");
		driver1.findElement(By.id("lastName")).sendKeys("test");
		driver1.findElement(By.id("userEmail")).sendKeys("test@test.com");
		driver1.findElement(By.id("age")).sendKeys("23");
		driver1.findElement(By.id("salary")).sendKeys("12344");
		driver1.findElement(By.id("department")).sendKeys("IT");
		
		Thread.sleep(3000);
		
		WebElement x = driver1.findElement(By.id("submit"));
		
		WebDriverWait w=new WebDriverWait(driver1, 10);
		w.until(ExpectedConditions.elementToBeClickable(x));
		x.click();
		
	}

}
