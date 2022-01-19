package actionclassinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String basepath=System.getProperty("user.dir");
		String actualpath=basepath+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualpath);
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/buttons");
		
		WebElement doubleClickbtn = driver.findElement(By.id("doubleClickBtn"));
		
		Actions ac=new Actions(driver);
		
		ac.doubleClick(doubleClickbtn).build().perform();
		
		Thread.sleep(3000);
		
		WebElement rightClickbtn = driver.findElement(By.id("rightClickBtn"));
		
		ac.contextClick(rightClickbtn).build().perform();
		
		Thread.sleep(3000);
		
		WebElement btn=driver.findElement(By.xpath("//button[starts-with(text(),'Click Me')]"));
		
		ac.moveToElement(btn).click().build().perform();
		
		
	}

}
