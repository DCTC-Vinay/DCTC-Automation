package alertsinselenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import selectclassinselenium.SelectClassInSelenium;

public class AlertInSelenium {
	
WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AlertInSelenium i=new AlertInSelenium();
		i.setup_browser();
		i.locate_alert();
	}

	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Feb 2022\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
	}
	
	public void locate_alert() throws InterruptedException
	{
		driver.findElement(By.id("promtButton")).click();
		Alert a3=driver.switchTo().alert();
		System.out.println(a3.getText());
		a3.sendKeys("Vinay");
		a3.accept();
		WebElement result = driver.findElement(By.id("promptResult"));
		System.out.println(result.getText());
		
		
		driver.findElement(By.id("alertButton")).click();
		Alert a1=driver.switchTo().alert();
		System.out.println(a1.getText());
		a1.accept();
		
		driver.findElement(By.id("timerAlertButton")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert a2=driver.switchTo().alert();
		System.out.println(a2.getText());
		a2.accept();
	}
	
	public void close_browser()
	{
		driver.close();
	}
}







