package actionclassinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ActionClassInSelenium {

WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ActionClassInSelenium i=new ActionClassInSelenium();
		i.setup_browser();
		i.action_methods();
	}

	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Feb 2022\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/buttons");
	}
	
	public void action_methods() throws InterruptedException
	{
		WebElement btn_double_click = driver.findElement(By.id("doubleClickBtn"));
		Actions ac=new Actions(driver);
		
		ac.moveToElement(btn_double_click).doubleClick().build().perform();
		
		WebElement btn_right_click=driver.findElement(By.id("rightClickBtn"));
		ac.moveToElement(btn_right_click).contextClick().build().perform();
		
		WebElement btn_click=driver.findElement(By.xpath("//button[starts-with(text(),'Click Me')]"));
		ac.moveToElement(btn_click).click().build().perform();
		
		
	}
	
	public void close_browser()
	{
		driver.close();
	}
}
