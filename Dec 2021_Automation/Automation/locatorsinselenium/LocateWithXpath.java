package locatorsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 //a[contains(text(),'Groups')]

//a[contains(text(),'Facebook')]

//*[contains(text(),'Facebook')]

//*[starts-with(text(),'Facebook')]

//a[starts-with(text(),'Facebook')]

//a[starts-with(text(),'Groups')]//parent::li

//a[contains(text(),'Groups')]//parent::li

//a[contains(text(),'Groups')]//parent::li//following-sibling::li[4]

//a[contains(text(),'Groups')]//parent::li//preceding-sibling::li[4] 
  
 */

public class LocateWithXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browser Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@test.com");
	}

}
