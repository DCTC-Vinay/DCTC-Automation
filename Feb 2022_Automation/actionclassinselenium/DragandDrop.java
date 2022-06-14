package actionclassinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DragandDrop i=new DragandDrop();
		i.setup_browser();
		i.action_methods();
	}

	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Feb 2022\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/drag_drop.html");
	}
	
	public void action_methods() throws InterruptedException
	{
		Actions ac=new Actions(driver);	
		
		WebElement src=driver.findElement(By.id("fourth"));
		WebElement dest=driver.findElement(By.id("amt7"));
		
		ac.dragAndDrop(src, dest).build().perform();
		
		WebElement src1=driver.findElement(By.id("credit2"));
		WebElement dest1=driver.findElement(By.id("bank"));
		
		ac.dragAndDrop(src1, dest1).build().perform();
	}
	
	public void close_browser()
	{
		driver.close();
	}
}
