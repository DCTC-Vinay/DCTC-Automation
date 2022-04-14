package waitsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browser Drivers\\Chrome\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://demoqa.com/checkbox");
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver1.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']")).click();
		
		Thread.sleep(3000);
		driver1.findElement(By.xpath("//input[@id='tree-node-desktop']//parent::label//preceding-sibling::button")).click();
		
		Thread.sleep(3000);
		driver1.findElement(By.xpath("//span[contains(text(),'Notes')]")).click();
	}

}
