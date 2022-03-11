package radiobuttoninselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browser Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		System.out.println("Value : "+radio1.getAttribute("value"));
		
		Thread.sleep(3000);
		radio1.click();
		
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		System.out.println("Value : "+radio2.getAttribute("value"));
		
		Thread.sleep(3000);
		radio2.click();
		
		WebElement radio3 = driver.findElement(By.id("vfb-7-3"));
		System.out.println("Value : "+radio3.getAttribute("value"));
		
		Thread.sleep(3000);
		radio3.click();
		
	}

}
