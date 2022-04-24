package actionclassinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDropInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browser Drivers\\Chrome\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement e1 = driver.findElement(By.id("credit2"));
		WebElement e2 = driver.findElement(By.id("bank"));
		
		Actions ac=new Actions(driver);
		
		ac.dragAndDrop(e1, e2).build().perform();
		
		WebElement e3 = driver.findElement(By.id("fourth"));
		WebElement e4 = driver.findElement(By.id("amt7"));
		
		ac.dragAndDrop(e3, e4).build().perform();
		
		WebElement e5 = driver.findElement(By.id("credit1"));
		WebElement e6 = driver.findElement(By.id("loan"));
		
		ac.dragAndDrop(e5, e6).build().perform();
		
		WebElement e7 = driver.findElement(By.id("fourth"));
		WebElement e8 = driver.findElement(By.id("amt8"));
		
		ac.dragAndDrop(e7, e8).build().perform();
	}

}
