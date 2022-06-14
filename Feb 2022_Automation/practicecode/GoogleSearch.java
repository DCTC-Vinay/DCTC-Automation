package practicecode;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import selectclassinselenium.SelectClassInSelenium;

public class GoogleSearch {
	
WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		GoogleSearch i=new GoogleSearch();
		i.setup_browser();
		i.search_text();
	}

	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Feb 2022\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	public void search_text() throws InterruptedException
	{
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Automation Using Java Selenium");
		
		WebElement btn_search=driver.findElement(By.name("btnK"));
		btn_search.submit();
		
		/*
		 * List<WebElement> result_search = driver.findElements(By.tagName("a"));
		 * for(WebElement r:result_search) { System.out.println(r.getAttribute("href"));
		 * }
		 */
		
		driver.findElement(By.xpath("//h3[contains(text(),'Selenium Tutorial - Javatpoint')]//parent::a")).click();
	}
	
	public void close_browser()
	{
		driver.close();
	}
}







