package radioInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		String basePath=System.getProperty("user.dir");
		String actualPath=basePath+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualPath);
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		
		
		WebElement no = driver.findElement(By.id("noRadio"));
		System.out.println(no.isEnabled());
		no.click();
		
		WebElement option1 = driver.findElement(By.id("vfb-7-1"));
		System.out.println("Option 1 :"+option1.isDisplayed());
		System.out.println("Option 1: "+option1.isSelected());
		
		
		
		Thread.sleep(3000);
		option1.click();
		
		System.out.println("Option 1 :"+option1.isSelected());
		
		WebElement option2 = driver.findElement(By.id("vfb-7-2"));
		
		option2.click();
		Thread.sleep(1500);
		
		System.out.println("Option 2: "+option2.isSelected());
	}

}
