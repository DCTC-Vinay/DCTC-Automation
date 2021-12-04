package checkboxInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String basePath = System.getProperty("user.dir");
		String actualPath = basePath + "\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualPath);

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");

		WebElement check1 = driver.findElement(By.id("vfb-6-0"));
		System.out.println("Checkbox 1: " + check1.isDisplayed());

		check1.click();
		Thread.sleep(1500);

		WebElement check2 = driver.findElement(By.id("vfb-6-1"));
		System.out.println("Checkbox 2: " + check2.isDisplayed());
		
		check2.click();
		
		WebElement check3 = driver.findElement(By.id("vfb-6-2"));
		System.out.println("Checkbox 3: " + check3.isDisplayed());
		
		check3.click();
		
		
	}
	

}
