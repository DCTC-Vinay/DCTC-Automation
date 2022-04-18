package alertsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsInSelenium {

	public static void main(String[] args) throws InterruptedException,UnhandledAlertException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browser Drivers\\Chrome\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
		 * driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		 * 
		 * driver.switchTo().frame("iframeResult");
		 * 
		 * driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		 * 
		 * Alert ae=driver.switchTo().alert(); ae.sendKeys("Ajay"); ae.accept();
		 */
		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		
		Alert ae=driver.switchTo().alert();
		ae.sendKeys("Ajay");
		Thread.sleep(3000);
		ae.accept();
		
		/*
		 * driver.findElement(By.id("alertButton")).click();
		 * 
		 * Alert ae = driver.switchTo().alert(); Thread.sleep(3000);
		 * System.out.println(ae.getText()); ae.accept();
		 * 
		 * driver.findElement(By.id("promtButton")).click(); ae =
		 * driver.switchTo().alert(); System.out.println(ae.getText());
		 * ae.sendKeys("Ajay"); Thread.sleep(3000); ae.accept();
		 */
		
		/*
		 * driver.findElement(By.id("timerAlertButton")).click(); Thread.sleep(5000);
		 * Alert ae1=driver.switchTo().alert(); System.out.println(ae1.getText());
		 * Thread.sleep(3000); ae1.accept();
		 */
		
		/*
		 * driver.findElement(By.id("confirmButton")).click(); ae =
		 * driver.switchTo().alert(); Thread.sleep(3000);
		 * System.out.println(ae.getText()); ae.dismiss();
		 */
		
		
		
		
		
	}

}
