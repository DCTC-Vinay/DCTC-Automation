package explicitWaitInJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitInJava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String basePath = System.getProperty("user.dir");
		String actualPath = basePath + "\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualPath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		driver.get("https://demoqa.com/webtables");
		
		driver.findElement(By.id("addNewRecordButton")).click();
		driver.findElement(By.id("firstName")).sendKeys("Vinay");
		driver.findElement(By.id("lastName")).sendKeys("Bhosale");
		driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
		driver.findElement(By.id("age")).sendKeys("30");
		driver.findElement(By.id("salary")).sendKeys("50000");
		driver.findElement(By.id("department")).sendKeys("IT");
		
		WebElement btnSubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit123")));
		
		//btnSubmit = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit123")));
		Thread.sleep(3000);
		
		btnSubmit.click();
	}

}
