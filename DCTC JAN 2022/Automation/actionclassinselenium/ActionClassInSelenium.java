package actionclassinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassInSelenium {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browser Drivers\\Chrome\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement r_click = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		Actions ac=new Actions(driver);
		//ac.contextClick(r_click).build().perform();
		ac.moveToElement(r_click).contextClick().build().perform();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		WebElement d_click = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		//ac.doubleClick(d_click).build().perform();
		ac.moveToElement(d_click).doubleClick().build().perform();
		
		Thread.sleep(3000);
		Alert al=driver.switchTo().alert();
		al.accept();
		
		//WebElement btn_submit=driver.findElement(By.id("submit"));
		
		//ac.moveToElement(btn_submit).click().build().perform();
	}

}
