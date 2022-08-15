package selectclassinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelection {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MultipleSelection m=new MultipleSelection();
		m.multiple_select();
	}
	
	public void multiple_select() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ip-slim-3\\eclipse-workspace\\DCTC DEC-21\\April 22 Automation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement sel_fruit = driver.findElement(By.id("fruits"));
		Select s1=new Select(sel_fruit);
		
		Thread.sleep(3000);
		s1.selectByValue("apple");
		
		Thread.sleep(3000);
		s1.selectByIndex(3);
		
		Thread.sleep(3000);
		s1.selectByVisibleText("Orange");
		
		Thread.sleep(3000);
		s1.deselectByIndex(3);
		
		Thread.sleep(3000);
		s1.deselectAll();
	}
}
