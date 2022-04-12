package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browser Drivers\\Chrome\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/form/div/div/input")).sendKeys("test");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("test@test.com");
		
		Thread.sleep(3000);
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("test12345");
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Voting Information Centre")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		
	}

}
