package actionInSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardRelatedAction {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String basePath = System.getProperty("user.dir");
		String actualPath = basePath + "\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualPath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement user = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement btnSubmit = driver.findElement(By.name("login"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(user).click().keyDown(Keys.SHIFT).sendKeys("india").keyUp(Keys.SHIFT).build().perform();
		ac.moveToElement(pass).click().sendKeys("abc@123").build().perform();
		ac.moveToElement(btnSubmit).sendKeys(Keys.ENTER).build().perform();
		driver.close();
	}

}
