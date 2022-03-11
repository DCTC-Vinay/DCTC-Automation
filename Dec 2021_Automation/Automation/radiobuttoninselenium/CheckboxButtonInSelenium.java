package radiobuttoninselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxButtonInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browser Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement check1 = driver.findElement(By.id("vfb-6-0"));
		System.out.println("Value : "+check1.getAttribute("value"));
		
		Thread.sleep(3000);
		check1.click();
		
		WebElement check2 = driver.findElement(By.id("vfb-6-1"));
		System.out.println("Value : "+check2.getAttribute("value"));
		
		Thread.sleep(3000);
		check2.click();
		
		WebElement check3 = driver.findElement(By.id("vfb-6-2"));
		System.out.println("Value : "+check3.getAttribute("value"));
		
		Thread.sleep(3000);
		check3.click();
		
	}

}
