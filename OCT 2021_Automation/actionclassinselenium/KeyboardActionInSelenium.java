package actionclassinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String basepath=System.getProperty("user.dir");
		String actualpath=basepath+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualpath);
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.name("login"));
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(email).click().keyDown(Keys.SHIFT).sendKeys("test").keyUp(Keys.SHIFT).build().perform();
		ac.moveToElement(password).click().sendKeys("test@123").build().perform();
		Thread.sleep(3000);
		ac.moveToElement(login).sendKeys(Keys.ENTER).build().perform();
	}

}
