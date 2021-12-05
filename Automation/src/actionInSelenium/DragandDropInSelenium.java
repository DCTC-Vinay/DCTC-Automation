package actionInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String basePath = System.getProperty("user.dir");
		String actualPath = basePath + "\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualPath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement src = driver.findElement(By.id("fourth"));
		WebElement dest = driver.findElement(By.id("amt7"));
		
		Actions ac=new Actions(driver);
		ac.dragAndDrop(src, dest).build().perform();
		
		WebElement src1=driver.findElement(By.id("credit2"));
		WebElement dest1=driver.findElement(By.id("bank"));
		
		ac.clickAndHold(src1).moveToElement(dest1).release(dest1).build().perform();
	}

}
