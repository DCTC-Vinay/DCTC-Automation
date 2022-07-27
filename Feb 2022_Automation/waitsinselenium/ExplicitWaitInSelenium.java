package waitsinselenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import selectclassinselenium.SelectClassInSelenium;

public class ExplicitWaitInSelenium {
	
WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExplicitWaitInSelenium i=new ExplicitWaitInSelenium();
		i.setup_browser();
		i.locate_dropdown();
	}

	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Feb 2022\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/webtables");
	}
	
	public void locate_dropdown() throws InterruptedException
	{
		driver.findElement(By.id("addNewRecordButton")).click();
		driver.findElement(By.id("firstName")).sendKeys("Test");
		driver.findElement(By.id("lastName")).sendKeys("Test");
		driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
		driver.findElement(By.id("age")).sendKeys("30");
		driver.findElement(By.id("salary")).sendKeys("450000");
		driver.findElement(By.id("department")).sendKeys("CS");
		
		WebElement submit_btn=driver.findElement(By.id("submit"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(submit_btn));
		
		submit_btn.submit();
	}
	
	public void close_browser()
	{
		driver.close();
	}
}
