package alertsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\chromedriver.exe";
	
		System.setProperty("webdriver.chrome.driver", actual_path);
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("alertButton")).click();
		
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(3000);
		alt.accept();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(3000);
		alt.accept();
		
		
		driver.findElement(By.id("confirmButton")).click();
		alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(3000);
		alt.dismiss();
		
		driver.findElement(By.id("promtButton")).click();
		alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("Ajay");
		Thread.sleep(3000);
		alt.accept();
		
		System.out.println(driver.findElement(By.id("promptResult")).getText());
		
	}

}








