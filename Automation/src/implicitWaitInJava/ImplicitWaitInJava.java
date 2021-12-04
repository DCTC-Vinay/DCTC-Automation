package implicitWaitInJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitInJava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String basePath = System.getProperty("user.dir");
		String actualPath = basePath + "\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualPath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);	
		
		driver.findElement(By.xpath("//span[contains(text(),'Web Tables')]")).click();
		driver.findElement(By.id("addNewRecordButton")).click();
		driver.findElement(By.id("firstName123")).sendKeys("Vinay");
		
		
		
	}

}
