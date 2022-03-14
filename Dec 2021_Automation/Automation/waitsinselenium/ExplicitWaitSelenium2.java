package waitsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitSelenium2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\chromedriver.exe";
	
		System.setProperty("webdriver.chrome.driver", actual_path);
		
		WebDriver driver=new ChromeDriver();
	
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/webtables");
		
		driver.findElement(By.id("addNewRecordButton")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Vinay");
		Thread.sleep(3000);
		
		driver.findElement(By.id("lastName")).sendKeys("Test");
		Thread.sleep(3000);
	
		driver.findElement(By.id("userEmail")).sendKeys("test@test.com");
		Thread.sleep(3000);
	
		driver.findElement(By.id("age")).sendKeys("34");
		Thread.sleep(3000);
		
		driver.findElement(By.id("salary")).sendKeys("45000");
		Thread.sleep(3000);
		
		driver.findElement(By.id("department")).sendKeys("SE");
		Thread.sleep(3000);	
		
		WebElement btnSubmit = driver.findElement(By.id("submit"));
		
		WebDriverWait wt=new WebDriverWait(driver, 10);
		
		wt.until(ExpectedConditions.elementToBeClickable(btnSubmit)).click();
		
	}

}
