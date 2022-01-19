package actionclassinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraganadDropInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String basepath=System.getProperty("user.dir");
		String actualpath=basepath+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualpath);
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src= driver.findElement(By.id("credit2"));
		WebElement dest=driver.findElement(By.id("bank"));		
		
		Thread.sleep(3000);
		
		Actions ac=new Actions(driver);
		ac.dragAndDrop(src, dest).build().perform();
		
		WebElement src1=driver.findElement(By.id("fourth"));
		WebElement dest1=driver.findElement(By.id("amt7"));
		
		Thread.sleep(3000);
		
		//ac.dragAndDrop(src1, dest1).build().perform();
		
		ac.clickAndHold(src1).moveToElement(dest1).release(dest1).build().perform();
	}

}
